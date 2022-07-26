package com.ironhack.purchaseruserservice.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "purchaser_user")
@PrimaryKeyJoinColumn(name = "user_id")
public class PurchaserUser extends User {

    // --- Properties --- //

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purchaser_user_id")
    private Long id;

    private String email;

    private Long phoneNumber;

    private String address;

    @OneToOne(mappedBy = "purchaserUser")
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
