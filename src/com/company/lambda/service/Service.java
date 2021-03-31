package com.company.lambda.service;

import com.company.lambda.entity.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * 在商城浏览商品信息时，经常会有条件的进行筛选浏览，例如要选颜色为红色的、价格小于8000千的
 */
public class Service {
    //筛选红色的商品
    public List<Product> filterProductByColor(List<Product> products){
        List<Product> prods = new ArrayList<Product>();
        for (Product product : prods) {
            if("red".equals(product.getColor())){
                prods.add(product);
            }
        }
        return prods;
    }

    //筛选价格小于8000的
    public List<Product> filterProductByPrice(List<Product> products){
        List<Product> prods = new ArrayList<Product>();
        for (Product product : prods) {
            if(8000>product.getPrice()){
                prods.add(product);
            }
        }
        return prods;
    }
}
