package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.BookEntity;
import com.demo.repository.BookRepository;
import com.demo.service.BookService;

@RestController

public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private BookRepository bookRepository;
	
	/*
	 * @PostMapping("/addbooks") public ResponseEntity<BookEntity>
	 * addbooks(@RequestBody BookEntity books){ BookEntity bookEntity1=
	 * bookService.addbooks(books); return
	 * ResponseEntity.status(201).body(bookEntity1); }
	 */
	
	
	@PostMapping("/addbooks")
	public BookEntity addbooks(@RequestBody BookEntity books){
	System.out.println(books +"check");
	System.out.println(books +"checking111*******");
	return bookService.addbooks(books);

	}
	
	@GetMapping("/getallbooks")
	public List<BookEntity> getallbooks () {
		return bookService.gettallbooks();
	}
	
	
	@GetMapping("/{id}")
	public Optional<BookEntity> getbyid(@PathVariable Long id){
		System.out.println(id +"id");
		return bookService.getbyid(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateBook(@PathVariable Long id , @RequestBody BookEntity updatedBook){
		BookEntity existingBook=bookService.getbyid(id).orElse(null);
		
		if (existingBook==null) {
			return new ResponseEntity<String>("Book not found with ID: " +id ,HttpStatus.NOT_FOUND);
		}
		
		existingBook.setAuthor(updatedBook.getAuthor());
		existingBook.setTitle(updatedBook.getTitle());
		existingBook.setPublishedYear(updatedBook.getPublishedYear());
		existingBook.setGenre(updatedBook.getGenre());
		bookRepository.save(existingBook);
		
		return new ResponseEntity<BookEntity>(existingBook, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBooksById(@PathVariable Long id)
	{
		bookService.deleteBooksById(id);
		
	}

	
}
