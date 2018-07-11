package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Todo;

@Repository
@Transactional
public class TodoRepositoryImpl implements TodoRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Todo save(Todo todo) {
		return em.merge(todo);
	}

	@Override
	public Todo find(int id) {
		return em.find(Todo.class, id);
	}

	@Override
	public List<Todo> findAll() {
		return em.createQuery("from Todo").getResultList();
	}

	

}
