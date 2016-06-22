package com.ecom.model;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import com.google.common.collect.Lists;
import org.springframework.data.couchbase.core.mapping.Document;

import java.util.List;

@Document
public class Category {
    @Id private String id;
    @Field("cat") private String value;
    @Field("sub") private List<Category> subCategories = Lists.newArrayList();

    public void addSubCategory(Category category) {subCategories.add(category);}

    public List<Category> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<Category> subCategories) {
        this.subCategories = subCategories;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
