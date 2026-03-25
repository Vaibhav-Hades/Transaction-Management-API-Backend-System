package com.vaibhav.transactionapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vaibhav.transactionapi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}