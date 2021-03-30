package com.company.lambda.service.impl;

import com.company.lambda.entity.Product;
import com.company.lambda.service.Service1;
import com.sun.deploy.services.Service;
import org.junit.Test;

import java.util.List;

public class FilterProductByPredicate extends Service1 {
    @Test
    public void test4(){
        List<Product> proList=null;
        List<Product> products = filterProductByPredicate(proList, (p) -> p.getPrice() < 8000);
        for (Product pro : products){
            System.out.println(pro);
        }
    }
}
