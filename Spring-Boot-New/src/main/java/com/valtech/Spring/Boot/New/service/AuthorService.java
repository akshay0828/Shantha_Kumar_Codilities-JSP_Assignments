package com.valtech.Spring.Boot.New.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.Spring.Boot.New.entity.Author;

public interface AuthorService {

	Author save(Author author);

	Author update(Author author);

	Author getAuthor(int id);

	List<Author> getAllAuthors();

}