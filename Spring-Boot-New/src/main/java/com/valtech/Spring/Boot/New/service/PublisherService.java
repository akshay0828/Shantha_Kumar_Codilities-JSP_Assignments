package com.valtech.Spring.Boot.New.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.Spring.Boot.New.entity.Publisher;

public interface PublisherService {

	Publisher savePublisher(Publisher publisher);

	Publisher updatePublisher(Publisher publisher);

	Publisher getPublisher(int id);

	List<Publisher> getAllPublisher();

}