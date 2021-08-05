package com.webflux.bootcamp.demo.controllers;


import com.webflux.bootcamp.demo.models.Book;
import com.webflux.bootcamp.demo.services.interfaces.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/annotated/books")
public class AnnotationController {

    private final BookService bookService;

    public AnnotationController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping
    public Flux<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    @GetMapping("/{id}")
    public Mono<Book> getBookById(@PathVariable String id) {
        return bookService.getBookById(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Book> createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }
    @PutMapping
    public Mono<Book> updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }
    @DeleteMapping("/{id}")
    public Mono<Void> deleteBookById(@PathVariable String id) {
        return bookService.deleteBookById(id);
    }
    @DeleteMapping
    public Mono<Void> deleteAllBooks() {
        return bookService.deleteAllBooks();
    }

}
