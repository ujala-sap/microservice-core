package com.microservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservice.data.api.TodoDataService;
import com.microservice.domain.TodoItem;
import com.microservice.domain.TodoItemList;
import com.microservice.service.api.TodoService;

@Service
@Transactional(readOnly = true)
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoDataService todoDataService;

	public TodoItem getTodoById(final long id) {
		return todoDataService.getTodoById(id);
	}

	public TodoItemList getTodoListByUser(final long userId) {
		return todoDataService.getTodoListByUser(userId);
	}

	public TodoItemList searchTodoListByTitle(final long userId,
			final String title) {
		return todoDataService.getTodoListByUserAndTitle(userId, title);
	}

	@Transactional
	public TodoItem update(TodoItem todoItem) {
		return todoDataService.update(todoItem);
	}

	@Transactional
	public TodoItem create(final TodoItem todoItem) {
		return todoDataService.create(todoItem);
	}

	@Transactional
	public void remove(final TodoItem todoItem) {
		todoDataService.remove(todoItem);
	}
}
