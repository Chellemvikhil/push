package com.wipro.app;

import java.time.LocalDate;

import org.apache.log4j.Logger;

import com.wipro.entity.Book;
import com.wipro.exception.BookException;
import com.wipro.service.BookService;
import com.wipro.service.BookServiceImpl;

//
public class App {
	private static BookService bookService = new BookServiceImpl();
	private static Logger appLogger = Logger.getLogger(App.class);
	
	public static void main(String[] args) {
//		try {
//			String status = bookService.addBook(new Book(null,"Jones","Spring Programming", LocalDate.of(2023, 10,15),550.0));
//			System.out.println(status);
//		}catch(BookException e) {
//			appLogger.error(e.getMessage(), e);
//		}
//		
		
		
		try {
			//invalid isbn
//			Book book = bookService.getBookById(1234L);
			
			//valid isbn
			Book book = bookService.getBookById(1L);
			System.out.println(book);
			
		}catch(BookException e) {
			appLogger.error(e.getMessage(), e);
		}
		
		
		
	}

}
