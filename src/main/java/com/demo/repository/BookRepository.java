package com.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity,Long> {

}
