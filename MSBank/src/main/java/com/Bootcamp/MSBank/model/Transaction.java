package com.Bootcamp.MSBank.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class Transaction {

    @Id
    private String transactionId;

    private String transactionNumber;
    private String accountId;
    private String customerId;
    private String accountType;
    private String transactionType;
    private String currencyType;
    private double mount;
    private byte   status;
    private Date   timestamp;

}