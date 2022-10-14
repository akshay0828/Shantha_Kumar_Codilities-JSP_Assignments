package com.valtech.Spring.Boot.New.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.Spring.Boot.New.entity.Author;
import com.valtech.Spring.Boot.New.entity.Car;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
