package com.sujata.persistence;

import java.util.List;

import com.sujata.bean.Item;

public interface ItemDao {
	
	List<Item> getAllRecord();
	int insertRecord(Item item);
	int deleteRecord(int id);
	int updatePrice(int id,int price);

}
