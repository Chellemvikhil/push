package com.wipro.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQueries(
		@NamedQuery(name="fetchAllBooks", query ="select b from Book b")
		)
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long isbn;
	private String author;
	private String title;
	private LocalDate publishDate;
	private Double price;
	
	public Book() {
		
	}

	public Book(Long isbn, String author, String title, LocalDate publishDate, Double price) {
		super();
		this.isbn = isbn;
		this.author = author;
		this.title = title;
		this.publishDate = publishDate;
		this.price = price;
	}

	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", author=" + author + ", title=" + title + ", publishDate=" + publishDate
				+ ", price=" + price + "]";
	}
	
	
}
