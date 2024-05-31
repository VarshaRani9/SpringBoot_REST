package com.xyz.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.xyz.example.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	public Book findById(int id);
}
