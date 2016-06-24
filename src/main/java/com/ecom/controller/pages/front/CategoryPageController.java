package com.ecom.controller.pages.front;

import com.ecom.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryPageController {

    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping(value = "/category/{categoryId}/categoryValue")
    public String showCategory(@PathVariable String categoryId, @PathVariable String categoryValue, Model model) {
        model.addAttribute("allCategories", categoryRepository.findAll());
        return "category";
    }


}
