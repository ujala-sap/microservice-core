package com.microservice.data.api;

import com.microservice.domain.TodoItem;
import com.microservice.domain.TodoItemList;

public interface TodoDataService {

	TodoItem getTodoById(final long id);

	TodoItemList getTodoListByUser(final long userId);

	TodoItemList getTodoListByUserAndTitle(final long userId, final String title);

	TodoItem create(final TodoItem todoItem);

	TodoItem update(TodoItem todoItem);

	void remove(final TodoItem todoItem);

}
