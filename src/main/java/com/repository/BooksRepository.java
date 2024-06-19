package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Books;



@Repository
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
}  