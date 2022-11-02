package com.shop.Ecommerceshop.repos;

import com.shop.Ecommerceshop.models.order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderRepository extends JpaRepository<order, Integer> {
}
