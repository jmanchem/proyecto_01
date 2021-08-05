package com.webflux.bootcamp.demo.services.implementation;


import com.webflux.bootcamp.demo.models.Book;
import com.webflux.bootcamp.demo.repository.BookRepository;
import com.webflux.bootcamp.demo.services.interfaces.BookService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Locale;

@Service
public class BookServiceImple implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImple (BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    private Book formatBook(Book book){
        book.setName(book.getName().toLowerCase());
        book.setAuthor(book.getAuthor().toUpperCase());
        return book;
    }

    @Override
    public Mono<Book> getBookById(String id){
        return bookRepository.findById(id)
                .map(this::formatBook);
    }

    @Override
    public Flux<Book> getAllBooks() {
        return bookRepository.findAll().map(this::formatBook);
    }
    @Override
    public Mono<Void> deleteBookById(String id) {
        return bookRepository.deleteById(id);
    }
    @Override
    public Mono<Void> deleteAllBooks() {
        return bookRepository.deleteAll();
    }
    @Override
    public Mono<Book> createBook(Book book) {
        if (book.getId() != null) {
            return Mono.error(new IllegalArgumentException("Id of New Book Must be Null"));
        }
        return bookRepository.save(book);
    }
    @Override
    public Mono<Book> updateBook(Book book) {
        return  bookRepository.existsById(book.getId())
                .flatMap(isExisting ->{
                    if (isExisting) {
                        return bookRepository.save(book);
                    } else {
                        return Mono.error(new IllegalArgumentException("The Book Id must exist for Update To Occur"));
                    }
                });
    }

}
