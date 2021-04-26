package com.example.api.stock.domain;

import javax.persistence.*;

@Entity
@Table(name = "stocks")
public class Stock {

    @Id
    @GeneratedValue
    @Column(name = "stock_id")
    private long stockId;

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
