package com.valtech.Spring.Boot.New.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.Spring.Boot.New.entity.Address;
import com.valtech.Spring.Boot.New.entity.Publisher;
import com.valtech.Spring.Boot.New.repo.AddressRepository;
import com.valtech.Spring.Boot.New.repo.PublisherRepository;

@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class PublisherServiceImpl implements PublisherService {
	
	@Autowired
	private PublisherRepository publisherRepository;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Publisher savePublisher(Publisher publisher){
		return publisherRepository.save(publisher);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Publisher updatePublisher(Publisher publisher){
		return publisherRepository.save(publisher);
	}
	
	@Override
	public Publisher getPublisher(int id){
		return publisherRepository.getReferenceById(id);
	}
	@Override
	public List<Publisher> getAllPublisher(){
		return publisherRepository.findAll();

}
}
