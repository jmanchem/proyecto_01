package com.Bootcamp.MSBank.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.*;
import java.util.Date;
@Data
@Document //Se le puede poner otro nombre
public class SavingAccount {
    @Id //Propiedade
    private String accountId;
    private String customerId;
    private String accountNumber;
    private String cardId;
    private String cardNumber;
    private String currencyType;//Tipo de moneda
    private String balance;
    private String status;
    private Date timestamp;
}
