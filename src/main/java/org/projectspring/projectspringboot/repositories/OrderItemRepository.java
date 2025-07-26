package org.projectspring.projectspringboot.repositories;

import org.projectspring.projectspringboot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
