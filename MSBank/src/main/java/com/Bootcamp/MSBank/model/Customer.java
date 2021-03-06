package com.Bootcamp.MSBank.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Data
@Document
public class Customer {
    @Id
    private String customerId;
    private String name;
    private String lastname;
    private String documentType;
    private String documentNumber;
    private String phoneNumber;
    private String email;
    private String customerTypeEP;
    private String customerTypeTF;
    private Date timestamp;
}
