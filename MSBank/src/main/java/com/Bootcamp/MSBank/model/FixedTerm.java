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
    private String accountNumber;
    private String cardId;
    private String cardNumber;
    private String currencyType;//(tipo moneda);
    private String balance;//Saldo
    private String status;
    private Date timestamp;
}
