package com.ironhack.edgeservice.Classes;


import com.ironhack.edgeservice.Model.User;

public class PurchaserUser extends User {

    // --- Properties --- //

    private Long id;

    private String email;

    private Long phoneNumber;

    private String address;

    private Order cart;

    // --- Constructor methods --- //

    public PurchaserUser() {
    }

    public PurchaserUser(String username, String password, String name, String email, Long phoneNumber, String address, Order cart) {
        super(username, password, name);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.cart = cart;
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

    public Order getCart() {
        return cart;
    }

    public void setCart(Order order) {
        this.cart = cart;
    }
}
