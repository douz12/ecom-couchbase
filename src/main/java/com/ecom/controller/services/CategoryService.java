package com.ecom.controller.services;

import com.ecom.model.Category;
import com.ecom.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping(value = "/requestCategory/{categoryId}")
    public Category requestCategory(@PathVariable String categoryId) {
        return categoryRepository.findOne(categoryId);
    }
}
