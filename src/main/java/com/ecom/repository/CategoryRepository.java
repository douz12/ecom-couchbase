package com.ecom.repository;

import com.ecom.model.Category;
import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.stream.Stream;

public interface CategoryRepository extends Repository<Category, String>, CrudRepository<Category, String> {

    @Query("select u from category u")
    Stream<Category> findAllCategories();
}
