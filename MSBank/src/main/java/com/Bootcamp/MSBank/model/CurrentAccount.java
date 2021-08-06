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
    private String cardId;
    private String cardNumber;
    private String currencyType;
    private double balance;
    private byte status;
    private Date timestamp;
}
