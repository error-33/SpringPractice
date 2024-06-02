package com.example.demo.service;

import com.example.demo.entities.Cat;

import java.util.List;

public interface CatService {
    public Cat create(Cat cat);

    public Cat update(Cat cat);

    public void delete(Integer id);

    public List<Cat> read();
}
