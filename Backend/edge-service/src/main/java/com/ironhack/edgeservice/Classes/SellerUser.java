package com.ironhack.edgeservice.Classes;

import com.ironhack.edgeservice.Model.User;

import java.util.List;

public class SellerUser extends User {

    // --- Properties --- //

    private String email;

    private Long phoneNumber;

    private String address;

    private String sellerType;
    private List<Product> productList;

    // --- Constructor methods --- //

    public SellerUser() {
    }

    public SellerUser(String username, String password, String name, String email, Long phoneNumber, String address, String sellerType, List<Product> productList) {
        super(username, password, name);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.sellerType = sellerType;
        this.productList = productList;
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

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> cart) {
        this.productList = productList;
    }

}
