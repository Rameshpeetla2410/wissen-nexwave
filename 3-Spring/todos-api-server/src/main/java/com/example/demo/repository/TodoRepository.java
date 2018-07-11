package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Todo;

public interface TodoRepository {
	Todo save(Todo todo);
	Todo find(int id);
	List<Todo> findAll();
}
