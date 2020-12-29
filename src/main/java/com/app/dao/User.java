package com.app.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Balance")
public class User {
    @Id
    private String id;
    private String name;
    private Double balance;

    @Indexed(unique = true)
    private String upi;
    @Indexed(unique = true)
    private String phone;

    public User(@JsonProperty("id") String id,
                @JsonProperty("name") String name,
                @JsonProperty("balance") Double balance,
                @JsonProperty("upi") String upi,
                @JsonProperty("phone") String phone) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.upi = upi;
        this.phone = phone;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getBalance() { return balance; }
    public void setBalance(Double balance) { this.balance = balance; }

    public String getUpi() { return upi; }
    public void setUpi(String upi) { this.upi = upi; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
