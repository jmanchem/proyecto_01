package com.Bootcamp.MSBank.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class CurrentAccount {

    @Id
    private String accountIdC;

    private String customerId;
    private String accountNumber;
    private String cardNumber;
    private String password;
    private String currencyType;
    private String balance;
    private String status;
    private Date   timestamp;

}
