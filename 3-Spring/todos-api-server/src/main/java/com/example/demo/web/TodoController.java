package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Todo;
import com.example.demo.repository.TodoRepository;

@RestController
@RequestMapping(value = "/api/todos")
public class TodoController {

	@Autowired
	private TodoRepository todoRepository;

	@PostMapping(consumes = { "application/json","application/xml" },
			     produces = { "application/json","application/xml" })
	public Todo saveTodo(@RequestBody Todo todo) {
		return this.todoRepository.save(todo);
	}

}
