package com.juliodev.projectspring.repositories;

import com.juliodev.projectspring.entities.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CategoryRepository {

    private final Map<Long, Category> map = new HashMap<>();

    public void save(Category category) {
        map.put(category.getId(), category);
    }

    public Category findById(Long id) {
        return map.get(id);
    }

    public List<Category> findAll() {
        return new ArrayList<Category>(map.values());
    }
}
