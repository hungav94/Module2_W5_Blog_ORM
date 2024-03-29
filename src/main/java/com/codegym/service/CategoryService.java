package com.codegym.service;

import com.codegym.model.Category;

public interface CategoryService {
    Iterable<Category> findAll();

    Category findByID(Long id);

    void save(Category category);

    void delete(Long id);
}
