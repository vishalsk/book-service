package com.jpop.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpop.book.Entity.Book;
import com.jpop.book.repository.BookRepository;
import com.jpop.book.services.BookService;

@RestController
@RequestMapping("/api/v1")
public class BookServiceController {

	@Autowired
	public BookService bookService;
	
	@Autowired 
	BookRepository bookRepos;
	
	@GetMapping(path="/books")
	public ResponseEntity<?> getAllBooks()
	{
				
		return bookService.getAllBooks();
		
	}
	
	
	@GetMapping(path="/books/{id}")
	public  ResponseEntity<?> getBookById(@PathVariable int id)
	{
		System.out.println(" id from request "+id);
		return ResponseEntity.status(HttpStatus.OK).body(bookRepos.findById(id));

		
	}
	
	@PostMapping(path="/books")
	public ResponseEntity<?> addBook(@RequestBody Book book)
	{
				
		bookRepos.save(book);
		return ResponseEntity.status(HttpStatus.OK).body("Book Added successfully");
	}
	
	@DeleteMapping(path="/books/{id}")
	public  ResponseEntity<?> deleteById(@PathVariable int id)
	{
		System.out.println(" id from request "+id);
		bookRepos.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("Book deleted successfully");

		
	}
	@PutMapping(path="/books/{id}")
	public ResponseEntity<?> updateBook(@PathVariable int id,@RequestBody Book book)
	{
		if(bookRepos.existsById(id)) {
			
			
			bookRepos.save(book);
			return ResponseEntity.status(HttpStatus.OK).body("Book updated successfully");

		}
		bookRepos.save(book);
		return ResponseEntity.status(HttpStatus.OK).body("Book updated successfully");
		
	}
}
