package com.sujata.persistence;

import java.util.List;

import com.sujata.bean.Item;

public interface ItemDao {
	
	List<Item> getAllRecord();
	boolean insertRecord(Item item);

}
