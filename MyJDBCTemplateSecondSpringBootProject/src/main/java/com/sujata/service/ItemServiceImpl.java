package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.Item;
import com.sujata.persistence.ItemDao;


public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao itemDao;
	
	@Override
	public List<Item> getAllItems() {
		return itemDao.getAllRecord();
	}

	@Override
	public int addItem(Item item) {		
		return itemDao.insertRecord(item);
	}

	@Override
	public int deleteItem(int id) {
		return itemDao.deleteRecord(id);
	}

	@Override
	public int updateItemPrice(int id, int price) {
		
		return itemDao.updatePrice(id, price);
	}

}
