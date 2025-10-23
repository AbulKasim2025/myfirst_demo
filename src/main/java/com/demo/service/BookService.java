package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.BookEntity;
import com.demo.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	
	BookRepository bookRepository;
	
	//create operation
	public BookEntity addbooks(BookEntity books) {
		
		return bookRepository.save(books);
		
	}
	
	//Read operation
	//will check this with Madhuri
	public List<BookEntity> gettallbooks() {
		
		return bookRepository.findAll();
		
	}
	
	//Read operation with specific ID
	
	public Optional<BookEntity> getbyid(Long id) {
		return bookRepository.findById(id);
	}
	
	public void deleteBooksById(Long id) {
		bookRepository.deleteById(id);
		
	}

}
