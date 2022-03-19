package com.maerskrsk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maerskrsk.model.Books;
import com.maerskrsk.service.BooksService;

import com.maerskrsk.exception.*;

// class as Controller
@RestController
public class BooksController {
	@Autowired
	BooksService booksService;

	

	@GetMapping("/api/{bookid}")
	private Books getBooks(@PathVariable("bookid") int bookid) {
		return booksService.getBooksById(bookid);
	}


	

	@PostMapping("/api/bookings")
	private Books update(@RequestBody Books books) {
		final Books saveBook=booksService.saveOrUpdate(books);
        	
		return saveBook;
	}
}
