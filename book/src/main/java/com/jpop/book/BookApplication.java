package com.jpop.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.jpop.book.controller.BookServiceController;
import com.jpop.book.repository.BookRepository;

@SpringBootApplication

public class BookApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

}
