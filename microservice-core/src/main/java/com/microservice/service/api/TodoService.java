package com.microservice.service.api;

import com.microservice.domain.TodoItem;
import com.microservice.domain.TodoItemList;

public interface TodoService {

	TodoItem getTodoById(final long id);

	TodoItemList getTodoListByUser(final long userId);

	TodoItemList searchTodoListByTitle(final long userId, final String title);

	TodoItem update(TodoItem todoItem);

	TodoItem create(final TodoItem todoItem);

	void remove(final TodoItem todoItem);

}
