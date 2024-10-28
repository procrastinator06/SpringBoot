package com.example.sprinstarter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sprinstarter.models.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    
} 