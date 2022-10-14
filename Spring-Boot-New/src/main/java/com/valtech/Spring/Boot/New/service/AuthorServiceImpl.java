package com.valtech.Spring.Boot.New.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.Spring.Boot.New.entity.Author;
import com.valtech.Spring.Boot.New.entity.Car;
import com.valtech.Spring.Boot.New.repo.AuthorRepository;
import com.valtech.Spring.Boot.New.repo.CarRepository;
@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class AuthorServiceImpl implements AuthorService {
	@Autowired
	private AuthorRepository authorRepository;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Author save(Author author){
		return authorRepository.save(author);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Author update(Author author){
		return authorRepository.save(author);
	}
	
	@Override
	public Author getAuthor(int id){
		return authorRepository.getReferenceById(id);
	}
	@Override
	public List<Author> getAllAuthors(){
		return authorRepository.findAll();
	}
}
