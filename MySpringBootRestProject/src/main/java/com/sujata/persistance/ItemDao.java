package com.sujata.persistance;

import org.springframework.data.repository.CrudRepository;

import com.sujata.bean.Item;

public interface ItemDao extends CrudRepository<Item, Integer> {

}
