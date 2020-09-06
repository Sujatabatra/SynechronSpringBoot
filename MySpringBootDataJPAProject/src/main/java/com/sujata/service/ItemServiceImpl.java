package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.Item;
import com.sujata.persistance.ItemDao;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao itemDao;
	
	@Override
	public List<Item> getAllItems() {
		List<Item> items=(List<Item>)itemDao.findAll();
		return items;
	}

	@Override
	public boolean addItem(Item item) {
		itemDao.save(item);
		return true;
	}
	

}
