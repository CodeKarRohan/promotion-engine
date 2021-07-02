package com.example.promotion.promotions;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComboPromo  implements  Promotion{

    private Sku sku1;
    private Sku sku2;
    private  Double price;
}
