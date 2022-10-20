package com.valtech.spring.tx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valtech.spring.tx.enetites.Tx;
import com.valtech.spring.tx.repo.TxRepository;

@Service
public  class TxServiceImpl implements Txservice {
	

	@Autowired
 private TxRepository txRepository;

	@Override
	public <S extends Tx> S save(S entity) {
		return txRepository.save(entity);
	}

	@Override
	public <S extends Tx> List<S> saveAll(Iterable<S> entities) {
		return txRepository.saveAll(entities);
	}

	@Override
	public long count() {
		return txRepository.count();
	}

	@Override
	public void delete(Tx entity) {
		txRepository.delete(entity);
	}

	@Override
	public Tx getById(Long id) {
		return txRepository.findById(id).get();
	}
	@Override
	public List<Tx> findAll() {
		return txRepository.findAll();
	}
	
	
	

}
