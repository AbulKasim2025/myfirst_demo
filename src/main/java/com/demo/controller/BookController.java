package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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
	System.out.println(books +"checking*******");
	return bookService.addbooks(books);

	}
	

}
