package com.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
/*
 * @Data
 * 
 * @NoArgsConstructor // it will generate constructor automatically by using
 * 
 * @AllArgsConstructor
 * 
 * @Builder
 * 
 * @Getter
 * 
 * @Setter
 */
//@Table
@Table(name = "book2")
public class BookEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // check the reason
	private Long id;
	@Column
	private String title;
	@Column
	private String author;
	@Column
	private int publishedYear;
	@Column
	private String genre;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", title=" + title + ", author=" + author + ", publishedYear=" + publishedYear
				+ ", genre=" + genre + "]";
	}
	
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
