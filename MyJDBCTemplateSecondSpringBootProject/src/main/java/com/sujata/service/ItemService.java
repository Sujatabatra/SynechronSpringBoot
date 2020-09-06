package com.sujata.service;

import java.util.List;

import com.sujata.bean.Item;

public interface ItemService {

	List<Item> getAllItems();
	int addItem(Item item);
	int deleteItem(int id);
	int updateItemPrice(int id,int price);
}
