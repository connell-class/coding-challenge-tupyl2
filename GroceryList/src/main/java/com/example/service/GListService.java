package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.GroceryList;
import com.example.repo.GListRepo;

@Component
public class GListService {
	
	@Autowired 
	GListRepo glr; 
	
	public void add(GroceryList gl) {
		glr.save(gl); 
	}
	
	public List<GroceryList> getLists(){
		return (List<GroceryList>) glr.findAll(); 
	}
	
	public void delete(int listId) {
		glr.deleteById(listId);
	}

}
