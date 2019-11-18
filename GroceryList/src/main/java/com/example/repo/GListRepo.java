package com.example.repo;

import org.springframework.data.repository.CrudRepository;


import com.example.model.GroceryList;

public interface GListRepo extends CrudRepository<GroceryList, Integer>{

}
