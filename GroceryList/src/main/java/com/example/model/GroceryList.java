package com.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="grocerylist")
public class GroceryList {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int listId; 
	
	
	@OneToMany(mappedBy= "groceryList", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<GroceryItem> glist = new ArrayList<>();
	
	
	public int getListId() {
		return listId;
	}
	public void setListId(int listId) {
		this.listId = listId;
	}
	public List<GroceryItem> getGlist() {
		return glist;
	}
	public void setGlist(List<GroceryItem> glist) {
		this.glist = glist;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(glist, listId);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof GroceryList))
			return false;
		GroceryList other = (GroceryList) obj;
		return Objects.equals(glist, other.glist) && listId == other.listId;
	}
	public GroceryList(int listId, List<GroceryItem> glist) {
		super();
		this.listId = listId;
		this.glist = glist;
	}
	public GroceryList() {
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GroceryList [listId=" + listId + ", glist=" + glist + "]";
	}

	
	
	

}
