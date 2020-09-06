package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;
import com.sujata.resources.ProfileViews;
import com.sujata.resources.ProfileViews.GlobalView;

@Entity
@Table(name = "Items")
public class Item {
	@Id
	@JsonView(ProfileViews.GlobalView.class)
	private int itemId;
	@JsonView({ProfileViews.ClientView.class})
	private String itemName;
	@JsonView(ProfileViews.MoreGlobalView.class)
	private int quantity;
	@JsonView(ProfileViews.ClientView.class)
	private int price;

	public Item() {

	}

	public Item(int itemId, String itemName, int quantity, int price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}

}
