package com.ecom.model;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import com.google.common.collect.Lists;
import org.joda.time.DateTime;
import org.springframework.data.couchbase.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Document
public class Offer {
    @Id private String id;
    @Field private String price;
    @Field private String promo;
    @Field("del") private DateTime delay;
    @Field("cost") private BigDecimal deliveryCost;
    @Field("cat") private Category category;
    @Field("prod") private List<Product> products = Lists.newArrayList();
    @Field("v") private Vendor vendor;

    public void addProduct(Product product) {products.add(product);}

    public DateTime getDelay() {
        return delay;
    }

    public void setDelay(DateTime delay) {
        this.delay = delay;
    }

    public BigDecimal getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(BigDecimal deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }
}
