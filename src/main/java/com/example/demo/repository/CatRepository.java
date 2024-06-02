package com.example.demo.repository;

import com.example.demo.entities.Cat;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends JpaRepository<Cat,Integer> {

}
