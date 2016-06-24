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
    @Field("sub") private List<Integer> subCategories = Lists.newArrayList();

    public void addSubCategory(Integer categoryId) {subCategories.add(categoryId);}

    public List<Integer> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<Integer> subCategories) {
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
