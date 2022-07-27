package com.ironhack.selleruserservice.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "user_id")
public class SellerUser extends User {

    // --- Properties --- //

    private String email;

    private Long phoneNumber;

    private String address;

    private String sellerType;

    @Column(name = "product_id")
    private Long productId;

    // --- Constructor methods --- //

    public SellerUser() {
    }

    public SellerUser(String username, String password, String name, String email, Long phoneNumber, String address, String sellerType, List<Product> productList) {
        super(username, password, name);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.sellerType = sellerType;
    }

    // --- Getters and setters --- //


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSellerType() {
        return sellerType;
    }

    public void setSellerType(String sellerType) {
        this.sellerType = sellerType;
    }

}
