package com.sujata.persistance;

import java.util.List;

import com.sujata.bean.Item;

public interface ItemDao {
	List<Item> getAllRecord();
	boolean insertRecord(Item item);
	boolean deleteRecord(int id);
	boolean updatePrice(int id,int price);

}
