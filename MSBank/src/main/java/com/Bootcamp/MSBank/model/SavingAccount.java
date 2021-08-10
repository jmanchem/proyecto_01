package com.Bootcamp.MSBank.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.*;
import java.util.Date;
@Data
@Document //Se le puede poner otro nombre
public class SavingAccount {
    @Id //Propiedade
    private String accountIdS;
    //private Object[] customerId;
    private String customerId;
    private String customerTypeEP;
    private String customerTypeTF;
    private String accountNumber;
    private String cardId;
    private String cardNumber;
    private String currencyType;//Tipo de moneda
    private double balance;
    private byte status;
    private Date timestamp;

}
