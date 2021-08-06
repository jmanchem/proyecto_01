package com.Bootcamp.MSBank.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Document //Se le puede poner otro nombre
public class SavingAccount {
    @Id //Propiedade
    private String accuntId;
    private String customerId;
    private String numberAccount;
    private String cardNumber;
    private String password;
    private String typeCurrency;//Tipo de moneda
    private String balance;
    private String status;
    private Date timestamp;
}
