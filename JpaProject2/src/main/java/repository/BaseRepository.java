package repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entity.Employee;

public class BaseRepository<T> {

	EntityManager entityManager; //global handle
	
	BaseRepository() {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("MyJPA");
		entityManager = factory.createEntityManager();
	}
	
	public  void save(T e)
	{
		EntityTransaction trans = entityManager.getTransaction();
		trans.begin();
			entityManager.persist(e);
		trans.commit();
	}
	public void merge(T e) {
		EntityTransaction trans = entityManager.getTransaction();
		trans.begin();
			entityManager.merge(e);
		trans.commit();
	}
	public void delete(int x) {
		EntityTransaction trans = entityManager.getTransaction();
		trans.begin();
			T t = (T) entityManager.find(, x);
			entityManager.remove(t);
		trans.commit();
	}
	public T find (int x) {
		return entityManager.find(Employee.class, x);
	}
	
	public List<T> findAll(String table) {
		TypedQuery<Employee> query = 
				entityManager.createQuery("from "+table,
						Employee.class);
			return query.getResultList();
	}
}
