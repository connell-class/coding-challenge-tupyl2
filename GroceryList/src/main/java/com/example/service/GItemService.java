package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.GroceryItem;
import com.example.repo.GItemRepo;

@Component
public class GItemService {
	
	@Autowired
	GItemRepo gir;
	
	public void add(GroceryItem gi) {
		gir.save(gi); 
	}
	
	public void delete(int itemId) {
		gir.deleteById(itemId);
	}

}
