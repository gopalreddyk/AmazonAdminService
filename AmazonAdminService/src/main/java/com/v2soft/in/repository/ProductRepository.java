package com.v2soft.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.v2soft.in.model.Product;

public interface ProductRepository  extends JpaRepository<Product, Integer> {

}
