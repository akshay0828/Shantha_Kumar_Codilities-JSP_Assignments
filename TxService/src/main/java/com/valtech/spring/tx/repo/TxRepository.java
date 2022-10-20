package com.valtech.spring.tx.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valtech.spring.tx.enetites.Tx;

public interface TxRepository extends JpaRepository<Tx, Long> {

}
