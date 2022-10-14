package com.valtech.Spring.Boot.New.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.Spring.Boot.New.entity.Address;

public interface AddressService {

	Address save(Address address);

	Address update(Address address);

	Address getAddress(int id);

	List<Address> getAllAddress();

}