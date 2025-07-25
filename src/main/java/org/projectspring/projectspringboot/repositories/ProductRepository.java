package org.projectspring.projectspringboot.repositories;

import org.projectspring.projectspringboot.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
