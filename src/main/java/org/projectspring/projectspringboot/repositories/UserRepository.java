package org.projectspring.projectspringboot.repositories;

import org.projectspring.projectspringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
