package com.shop.Ecommerceshop.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Service
@Transactional
public class service<X extends JpaRepository,Y> {

    private X repo;

    public List<Y> getAll() {
        return repo.findAll();
    }

    public void save(Y product) {
        repo.save(product);
    }

    public Object get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
    public void update(Y product,int prodid)
    {
        repo.save(product);
    }
}

