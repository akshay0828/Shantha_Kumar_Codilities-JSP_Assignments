package com.valtech.spring.tx.service;

import java.util.List;

import com.valtech.spring.tx.enetites.Tx;

public interface Txservice {

	<S extends Tx> S save(S entity);

	<S extends Tx> List<S> saveAll(Iterable<S> entities);

	long count();

	void delete(Tx entity);

	Tx getById(Long id);

	List<Tx> findAll();

}