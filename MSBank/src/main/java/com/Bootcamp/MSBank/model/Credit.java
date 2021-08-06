package com.Bootcamp.MSBank.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@Document
public class Credit {
    @Id
    private String creditId;
    private String customerId;
    private String creditNumber;
    private String cardNumber; //Solo para tarjeta de credito
    private String cardName;
    private String expirationDate;
    private int securityCode;
    private String customerType;
    private String currencyType;
    private double balance;
    private byte status;
    private Date timestamp;
}
