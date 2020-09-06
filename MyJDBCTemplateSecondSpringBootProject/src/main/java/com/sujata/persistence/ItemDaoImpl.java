package com.sujata.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Item;


public class ItemDaoImpl implements ItemDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Item> getAllRecord() {
		
		return jdbcTemplate.query("select * from items", new RowMapper<Item>() {
			@Override
			public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
				Item item=new Item();
				item.setItemId(rs.getInt("itemid"));
				item.setItemName(rs.getString("itemname"));
				item.setQuantity(rs.getInt("quantity"));
				item.setPrice(rs.getInt("price"));
				return item;
			}
		});
	}
	

	@Override
	public int insertRecord(Item item) {
		return jdbcTemplate.update("insert into items(itemid,itemname,quantity,price) values(?,?,?,?)", item.getItemId(),item.getItemName(),item.getQuantity(),item.getPrice());
	}

	@Override
	public int deleteRecord(int id) {
		
		return jdbcTemplate.update("delete from items where itemid=?", id);
	}

	@Override
	public int updatePrice(int id, int price) {
		return jdbcTemplate.update("update items set price=? where itemid=?",price, id);
	}

}
