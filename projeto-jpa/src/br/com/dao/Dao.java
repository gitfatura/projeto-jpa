package br.com.dao;

import java.util.List;

import javax.persistence.EntityManager;

public class Dao<T>{

	private final EntityManager manager = new JPAUtil().getEntityManager();
	private Class<T> classe;
	
	public Dao(Class<T> classe){
		super();
		this.classe = classe;
	}
	
	
	public void adiciona(T t) {
		manager.getTransaction().begin();
		manager.persist(t);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void update(T t) {
		manager.getTransaction().begin();
		manager.merge(t);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void remove(T t) {
		manager.getTransaction().begin();
		manager.remove(manager.merge(t));
		manager.getTransaction().commit();
		manager.close();
	
	}
	
	public T buscaPorId(Long id) {
		return manager.find(classe, id);
	}
	
	
	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		return manager.createQuery("from " + classe.getName()).getResultList();
	}
	
		
	
	
}