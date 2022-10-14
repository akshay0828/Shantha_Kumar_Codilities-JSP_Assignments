package com.valtech.Spring.Boot.New.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.Spring.Boot.New.entity.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
