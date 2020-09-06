package com.sujata.persistance;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Item;

@Repository
public class ItemDaoImpl implements ItemDao {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public List<Item> getAllRecord() {
		Session session=entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query query=session.createQuery("from Item");   //HQL ( Hibernate Query Language) select * from tablename;(SQL) => from entityname;(HQL) 
		return query.getResultList();
	}

	@Override
	public boolean insertRecord(Item item/*transient state*/) {
		Session session=entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Transaction t=session.beginTransaction();
		session.save(item);
		//persistent
		t.commit();
		return true;
	}

	@Override
	public boolean deleteRecord(int id) {
		Session session=entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Transaction t=session.beginTransaction();
		Item item=session.get(Item.class, id);
		session.delete(item);
		t.commit();
		return true;
	}

	@Override
	public boolean updatePrice(int id, int price) {
		Session session=entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Transaction t=session.beginTransaction();
		Item item=session.get(Item.class, id); //persistence
		item.setPrice(price);
		t.commit();
		return true;
	}

}
