package org.projectspring.projectspringboot.repositories;

import org.projectspring.projectspringboot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
