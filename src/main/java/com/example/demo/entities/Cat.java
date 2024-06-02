package com.example.demo.entities;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cat")
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public Cat(){

    }
    @Column(name= "name")
    private String name;
    @Column(name = "age")
    private Integer age;



}
