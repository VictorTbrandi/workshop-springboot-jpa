package org.projectspring.projectspringboot.repositories;

import org.projectspring.projectspringboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
