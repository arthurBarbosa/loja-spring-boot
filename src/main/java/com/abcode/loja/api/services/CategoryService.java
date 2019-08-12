package com.abcode.loja.api.services;

import com.abcode.loja.api.domain.Category;
import com.abcode.loja.api.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category find(Long id) {
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.orElse(null);
    }
}
