package com.Bootcamp.MSBank.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.*;
import java.math.BigDecimal;

@Data
@Document //Se le puede poner otro nombre
public class SavingAccount {
    @Id //Propiedade
    private String idAccount;
    private String idClient;
    private String numberAccount;
    private String cardNumber;
    private String password;
    private String typeCurrency;
    private String balance;
    private String status;
    private String timestamp;
}
