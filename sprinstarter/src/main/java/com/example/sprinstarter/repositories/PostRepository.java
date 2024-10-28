package com.example.sprinstarter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sprinstarter.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    
} 
