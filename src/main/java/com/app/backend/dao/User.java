package com.app.backend.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "balance")
public class User {
    @Id
    private String id;
    private String name;
    private double balance;

    @Indexed(unique = true)
    private String upi_id;
    @Indexed(unique = true)
    private String phone;

    public User(@JsonProperty("id") String id,
                @JsonProperty("name") String name,
                @JsonProperty("balance") double balance,
                @JsonProperty("upi_id") String upi_id,
                @JsonProperty("phone") String phone) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.upi_id = upi_id;
        this.phone = phone;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public String getUpi_id() { return upi_id; }
    public void setUpi_id(String upi_id) { this.upi_id = upi_id; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
