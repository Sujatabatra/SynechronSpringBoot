package com.sujata.persistance;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Item;

@Repository
public interface ItemDao extends CrudRepository<Item, Integer> {
	
//	@Query(value="select * from items i where i.itemname=?1",nativeQuery=true)
	@Query("from Item i where i.itemName=?1")
	public Optional<Item> findByName(String name);

	
}
