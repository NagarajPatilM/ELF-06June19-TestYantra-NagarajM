package com.testyantra.libmgmt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testyantra.libmgmt.dto.Book;


@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{

}
