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

    private SellerType sellerType;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "productName", column = @Column(name = "product_name")),
            @AttributeOverride(name = "quantity", column = @Column(name = "quantity")),
            @AttributeOverride(name = "weightPerKg", column = @Column(name = "weight_per_kg")),
            @AttributeOverride(name = "price", column = @Column(name = "price"))
    })

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Product> productList;

    // --- Constructor methods --- //

    public SellerUser() {
    }

    public SellerUser(String username, String password, String name, String email, Long phoneNumber, String address, SellerType sellerType, List<Product> productList) {
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

    public SellerType getSellerType() {
        return sellerType;
    }

    public void setSellerType(SellerType sellerType) {
        this.sellerType = sellerType;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> cart) {
        this.productList = productList;
    }

}
