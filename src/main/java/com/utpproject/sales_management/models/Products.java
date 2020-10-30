package com.utpproject.sales_management.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Products {
    private Integer id;
    private String description;
    private BigDecimal price;
    private String unity;
    private Integer stock;
    private Integer productStatusId;
    private Integer productCategoryId;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "unity")
    public String getUnity() {
        return unity;
    }

    public void setUnity(String unity) {
        this.unity = unity;
    }

    @Basic
    @Column(name = "stock")
    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Basic
    @Column(name = "product_status_id")
    public Integer getProductStatusId() {
        return productStatusId;
    }

    public void setProductStatusId(Integer productStatusId) {
        this.productStatusId = productStatusId;
    }

    @Basic
    @Column(name = "product_category_id")
    public Integer getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Objects.equals(id, products.id) &&
                Objects.equals(description, products.description) &&
                Objects.equals(price, products.price) &&
                Objects.equals(unity, products.unity) &&
                Objects.equals(stock, products.stock) &&
                Objects.equals(productStatusId, products.productStatusId) &&
                Objects.equals(productCategoryId, products.productCategoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, price, unity, stock, productStatusId, productCategoryId);
    }
}
