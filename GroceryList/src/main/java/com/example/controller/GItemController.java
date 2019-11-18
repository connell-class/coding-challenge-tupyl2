package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.GroceryItem;
import com.example.service.GItemService;

@RestController
@RequestMapping("/gitem")
public class GItemController {

	@Autowired
	GItemService is;
	
	@PostMapping("/addItem")
	public void addItem(GroceryItem gi) {
		is.add(gi);
	}
	
	@DeleteMapping("/deleteItem")
	public void delete(@PathVariable(required=true) int itemId) {
		is.delete(itemId);
	}
}
