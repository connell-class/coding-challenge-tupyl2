package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.GroceryList;
import com.example.service.GListService;

@RestController
@RequestMapping("/glist")
public class GListController {
	
	@Autowired
	GListService ls; 
	
	@PostMapping("/addList")
	public void addList(GroceryList gl) {
		System.out.println("what");
		ls.add(gl);
	}
	
	@GetMapping("/getAllLists")
	public List<GroceryList> getLists() {
		return ls.getLists();	
	}
	
	@DeleteMapping("/deleteList")
	public void delete(@PathVariable(required=true)int listId) {
		ls.delete(listId);
	}
	
	
	

}
