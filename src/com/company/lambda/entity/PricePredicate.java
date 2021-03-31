package com.company.lambda.entity;
import com.company.lambda.service.MyPredicate;
import com.company.lambda.service.Service1;
import org.junit.Test;

import java.util.List;

/**
 * 如果想要筛选价格小于8000的商品，那么新建一个价格过滤类既可
 */
public class PricePredicate extends Service1 implements MyPredicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getPrice() < 8000;
    }
}
