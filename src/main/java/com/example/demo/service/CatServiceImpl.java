package com.example.demo.service;

import com.example.demo.entities.Cat;
import com.example.demo.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CatServiceImpl implements CatService {
@Autowired
    CatRepository catRepository;
    @Override
    public Cat create(Cat cat) {
        return catRepository.save(cat);
    }

    @Override
    public Cat update(Cat cat) {
        return catRepository.save(cat);
    }

    @Override
    public void delete(Integer id) {
        catRepository.deleteById(id);
    }

    @Override
    public List<Cat> read() {
        return catRepository.findAll();
    }
}
