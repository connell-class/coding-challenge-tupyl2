package com.example.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.model.GroceryItem;

public interface GItemRepo extends CrudRepository<GroceryItem, Integer>{

}
