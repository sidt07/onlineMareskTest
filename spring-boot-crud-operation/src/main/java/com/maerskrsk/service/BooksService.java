package com.maerskrsk.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.maerskrsk.model.Availabilty;
import com.maerskrsk.model.Books;
import com.maerskrsk.repository.BooksRepository;

@Service
public class BooksService {
	@Autowired
	BooksRepository booksRepository;
	
	  //@Autowired RestTemplate restTemplate;
	 

	public List<Books> getAllBooks() {
		List<Books> books = new ArrayList<Books>();
		booksRepository.findAll().forEach(books1 -> books.add(books1));
		return books;
	}

	public Books getBooksById(int id) {
		return booksRepository.findById(id).get();
	}

	public Books saveOrUpdate(Books books) {

//		Availabilty adAvailabilty= new Availabilty();
//		if(verfiyAvailabilty() > 6) {
//			adAvailabilty.setAvailablty(true);
//		 }
//        if(true)
		return booksRepository.save(books);
	}

	private int verfiyAvailabilty() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> availabilty1 = new HttpEntity<String>(headers);
		/*
		 * Availabilty availabilty=restTemplate
		 * .exchange("https://maersk.com/api/bookings/checkAvailable", HttpMethod.GET,
		 * availabilty1, Availabilty.class) .getBody();
		 */
		return 6;
		//return availabilty.setAvailableSpace(6);

	}

	public void delete(int id) {
		booksRepository.deleteById(id);
	}

//updating a record
	public void update(Books books, int bookid) {
		booksRepository.save(books);
	}
}