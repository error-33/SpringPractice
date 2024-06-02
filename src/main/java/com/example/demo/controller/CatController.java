package com.example.demo.controller;

import com.example.demo.entities.Cat;
import com.example.demo.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class CatController {
    @Autowired
    CatService catService;
    @GetMapping("/get")
    public List<Cat> GetAll() {
        return catService.read();
    }
    @DeleteMapping("/delete/{id}")
    public void DeleteAll(@PathVariable Integer id){
        catService.delete(id);
    }
    @PostMapping("/post")
    public Cat PostAll(@RequestBody Cat cat){
        return  catService.create(cat);
    }
    @PutMapping("/update")
    public Cat PutAll(@RequestBody Cat cat){
        return  catService.update(cat);
    }

}
