package com.ecom.repository;

import com.ecom.model.Category;
import org.springframework.data.couchbase.core.query.View;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category, String> {

    @View(viewName = "by_categoryIDAndValue")
    List<Category> findByIdAndValue(String id, String value);
}
