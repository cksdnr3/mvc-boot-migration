package com.example.api.address;

import javax.persistence.*;

@Entity
@Table(name="addresses")
public class Address {

    @Id
    @GeneratedValue
    @Column(name="address_id") private long addressId;

    @Column(name="name") private String name;

    @Column(name="address") private String address;

    @Column(name="reg_date") private String regDate;
}
