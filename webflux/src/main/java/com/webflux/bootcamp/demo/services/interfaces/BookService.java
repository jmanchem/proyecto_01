package com.webflux.bootcamp.demo.services.interfaces;

import com.webflux.bootcamp.demo.models.Book;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookService {

    Mono<Book> getBookById(String id);

    Flux<Book> getAllBooks();

    Mono<Void> deleteBookById(String id);

    Mono<Void> deleteAllBooks();

    Mono<Book> createBook(Book book);

    Mono<Book> updateBook(Book book);

}
