package com.sujata.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Item;

@Repository
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
	public boolean insertRecord(Item item) {
		
		return false;
	}

}
