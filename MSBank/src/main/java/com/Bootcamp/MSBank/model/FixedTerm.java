package com.Bootcamp.MSBank.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
@Data
@Document //Se le puede poner otro nombre
public class FixedTerm {
    @Id //Propiedade
    private String accountIdF;
    private String customerId; //Id customer
    private String customerTypeEP;
    private String customerTypeTF;
    private String accountNumber;
    private String cardId;
    private String cardNumber;
    private String currencyType;//(tipo moneda);
    private double balance;//Saldo
    private byte status;
    private Date timestamp;
}
