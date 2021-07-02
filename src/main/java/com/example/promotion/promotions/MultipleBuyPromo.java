package com.example.promotion.promotions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MultipleBuyPromo implements  Promotion {

    private Sku sku;
    private int quanity;
    private double price;


}
