package com.jpop.book.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jpop.book.repository.BookRepository;


@Service
public class BookService {

	
	@Autowired(required=true)
	public BookRepository bookRepository;
	
	public ResponseEntity<?> getAllBooks()
	{
		return ResponseEntity.status(HttpStatus.OK).body( bookRepository.findAll());

	}

	
	
	
}
