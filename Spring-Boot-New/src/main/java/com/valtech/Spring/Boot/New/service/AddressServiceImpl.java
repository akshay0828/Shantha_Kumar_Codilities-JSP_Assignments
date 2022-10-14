package com.valtech.Spring.Boot.New.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.Spring.Boot.New.entity.Address;
import com.valtech.Spring.Boot.New.entity.Author;
import com.valtech.Spring.Boot.New.repo.AddressRepository;
import com.valtech.Spring.Boot.New.repo.AuthorRepository;

@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Address save(Address address){
		return addressRepository.save(address);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Address update(Address address){
		return addressRepository.save(address);
	}
	
	@Override
	public Address getAddress(int id){
		return addressRepository.getReferenceById(id);
	}
	@Override
	public List<Address> getAllAddress(){
		return addressRepository.findAll();

}
}
