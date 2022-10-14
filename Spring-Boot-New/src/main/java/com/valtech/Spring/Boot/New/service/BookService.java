package com.valtech.Spring.Boot.New.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.Spring.Boot.New.entity.Book;

public interface BookService {

	Book saveBook(Book book);

	Book updateBook(Book book);

	Book getBook(int id);

	List<Book> getAllBook();

}