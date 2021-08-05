package com.webflux.bootcamp.demo.controllers;


import com.webflux.bootcamp.demo.models.Book;
import com.webflux.bootcamp.demo.services.interfaces.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@EnableWebFlux
public class FunctionalController {

    private static String BASE_URL = "/v1/functional/books";
    private final BookService bookService;

    public FunctionalController(BookService bookService) {
        this.bookService = bookService;
    }
    @Bean
    public RouterFunction<ServerResponse> getAllBooks() {
        return RouterFunctions.route()
                .GET(BASE_URL, request -> ServerResponse.ok().body(bookService.getAllBooks(), Book.class)).build();
    }
    @Bean
    public RouterFunction<ServerResponse> getBookById() {
        return RouterFunctions.route()
                .GET(BASE_URL.concat("/{id}"), request -> {
                    String id = request.pathVariable("id");
                    return ServerResponse.ok().body(bookService.getBookById(id), Book.class);
                }).build();
    }
    @Bean
    public RouterFunction<ServerResponse> createBook() {
        return RouterFunctions.route()
                .POST(BASE_URL, request -> request.bodyToMono(Book.class)
                        .flatMap(bookService::createBook)
                        .flatMap(book -> ServerResponse.status(HttpStatus.CREATED)
                                .body(book, Book.class))).build();
    }
    @Bean
    public RouterFunction<ServerResponse> updateBook() {
        return RouterFunctions.route()
                .PUT(BASE_URL, request -> request.bodyToMono(Book.class)
                        .flatMap(bookService::updateBook)
                        .flatMap(book -> ServerResponse.ok()
                                .body(book, Book.class))).build();
    }
    @Bean
    public RouterFunction<ServerResponse> deleteBookById() {
        return RouterFunctions.route()
                .DELETE(BASE_URL.concat("/{id}"), request -> {
                    String id = request.pathVariable("id");
                    return ServerResponse.ok().body(bookService.deleteBookById(id), Void.class);
                }).build();
    }
    @Bean
    public RouterFunction<ServerResponse> deleteAllBooks() {
        return RouterFunctions.route()
                .DELETE(BASE_URL, request -> ServerResponse.ok()
                        .body(bookService.deleteAllBooks(), Void.class)).build();
    }


}
