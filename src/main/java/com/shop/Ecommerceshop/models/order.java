package com.shop.Ecommerceshop.models;
import javax.persistence.*;

@Entity
@Table
public class order {
    private Integer id_order;
    private Integer id_user;
    private Integer id_product;
    private Integer count_product;

    public order() {
    }

    public order(Integer id_order, Integer id_user, Integer id_product, Integer count_product) {
        this.id_order = id_order;
        this.id_user = id_user;
        this.id_product = id_product;
        this.count_product = count_product;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId_order() {
        return id_order;
    }

    public void setId_order(Integer id_order) {
        this.id_order = id_order;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public Integer getId_product() {
        return id_product;
    }

    public void setId_product(Integer id_product) {
        this.id_product = id_product;
    }

    public Integer getCount_product() {
        return count_product;
    }

    public void setCount_product(Integer count_product) {
        this.count_product = count_product;
    }
}
