package com.example.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="groceryitem")
public class GroceryItem {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int itemId; 
	
	@Column
	private String item;
	
	@Column
	private String type;
	
	@ManyToOne
	@JoinColumn
	private GroceryList groceryList; 
	/**
	 * @return the itemId
	 */
	public int getItemId() {
		return itemId;
	}
	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public int hashCode() {
		return Objects.hash(item, itemId, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof GroceryItem))
			return false;
		GroceryItem other = (GroceryItem) obj;
		return Objects.equals(item, other.item) && itemId == other.itemId && Objects.equals(type, other.type);
	}
	public GroceryItem(int itemId, String item, String type) {
		super();
		this.itemId = itemId;
		this.item = item;
		this.type = type;
	}
	public GroceryItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "GroceryItem [itemId=" + itemId + ", item=" + item + ", type=" + type + "]";
	}
	
	

}
