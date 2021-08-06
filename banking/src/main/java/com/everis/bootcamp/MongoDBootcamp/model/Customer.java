package com.everis.bootcamp.MongoDBootcamp.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Getter
@Setter
@Document
public class Customer {

    @Id
    private Integer customerId;

    private String name;
    private String lastname;
    private String documentType;
    private String documentNumber;
    private String phoneNumber;
    private String email;
    private String customerType;
    private String customerType2;
    private Date   timestamp;

}
