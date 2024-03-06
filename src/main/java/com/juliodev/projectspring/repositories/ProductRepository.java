package com.juliodev.projectspring.repositories;

import com.juliodev.projectspring.entities.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductRepository {

    private final Map<Long, Product> map = new HashMap<>();

    public void save(Product product) {
        map.put(product.getId(), product);
    }

    public Product findById(Long id) {
        return map.get(id);
    }

    public List<Product> findAll() {
        return new ArrayList<Product>(map.values());
    }
}
