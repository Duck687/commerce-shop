package com.shop.Ecommerceshop.repos;

import com.shop.Ecommerceshop.models.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface prodRepository extends JpaRepository<product, Integer> {
}
