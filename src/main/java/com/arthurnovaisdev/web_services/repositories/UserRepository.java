package com.arthurnovaisdev.web_services.repositories;

import com.arthurnovaisdev.web_services.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
