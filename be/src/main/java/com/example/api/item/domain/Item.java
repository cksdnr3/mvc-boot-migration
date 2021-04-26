package com.example.api.item.domain;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private long itemId;

    @Column(name = "item_brand")
    public String itemBrand;

    @Column(name = "model_no")
    public String modelNo;

    @Column(name = "item_name")
    public String itemName;

    @Column(name = "item_color")
    public String itemColor;

    @Column(name = "release_date")
    public String releaseDate;
}
