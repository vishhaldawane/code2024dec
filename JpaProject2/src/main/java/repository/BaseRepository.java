package repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entity.Employee;

public class BaseRepository {

	EntityManager entityManager; //global handle
	
	BaseRepository() {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("MyJPA");
		entityManager = factory.createEntityManager();
	}
	
	public  void save(Object e)
	{
		EntityTransaction trans = entityManager.getTransaction();
		trans.begin();
			entityManager.persist(e);
		trans.commit();
	}
	
	public void merge(Object e) {
		EntityTransaction trans = entityManager.getTransaction();
		trans.begin();
			entityManager.merge(e);
		trans.commit();
	}
		
	public <E> void delete(Class<E> classname, int x) {
		EntityTransaction trans = entityManager.getTransaction();
		trans.begin();
			E e = entityManager.find(classname, x);
			entityManager.remove(e);
		trans.commit();
	}
	
	public <E> E find(Class<E> classname, Serializable pk) {
		E e = entityManager.find(classname, pk);
		return e;
	}

	
	public <E> List<E> findAll(Class<E> classname, String table) {
		TypedQuery<E> query = 
				entityManager.createQuery("from "+table,classname);
			return query.getResultList();
	}
}
