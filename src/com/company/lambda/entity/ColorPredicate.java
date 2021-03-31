package com.company.lambda.entity;

import com.company.lambda.service.MyPredicate;

public class ColorPredicate implements MyPredicate<Product> {
    private static final String RED = "红色";
    @Override
    public boolean test(Product product) {
        return RED.equals(product.getColor());
    }
}
