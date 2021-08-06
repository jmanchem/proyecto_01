package com.Bootcamp.MSBank.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
@Data
@Document
public class Card {
    @Id //Propiedade
    private String cardId;
    private String cardPassword;
    private String customerId;
    private String documentNumber;
    private String cardNumber;
    private String cardName;
    private String expirationDate;
    private int securityCode;
    private byte status;
    private Date timestamp;
}
