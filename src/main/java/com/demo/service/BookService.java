package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.BookEntity;
import com.demo.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	
	BookRepository bookRepository;
	
	
	public BookEntity addbooks(BookEntity books) {
		
		return bookRepository.save(books);
		
	}
	


}
