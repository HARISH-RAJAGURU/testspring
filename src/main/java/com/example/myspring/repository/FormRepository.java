package com.example.myspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myspring.Entity.Forms;


@Repository
public interface FormRepository extends JpaRepository<Forms,Integer> {
    
}
