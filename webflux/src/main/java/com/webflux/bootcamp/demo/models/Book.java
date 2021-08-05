package com.webflux.bootcamp.demo.models;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
public class Book {

    @Id
    private String id;
    private String name;
    private String author;

    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

}
