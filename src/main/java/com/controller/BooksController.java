package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Books;
import com.service.BooksService;

import jakarta.websocket.server.PathParam;

@RestController
public class BooksController {
@Autowired
BooksService booksservice;
@GetMapping("/books")
private List<Books> getAllbooks()
{
	return booksservice.getAllBooks();
}
@GetMapping("/getById/{bookid}")
private Books getBookbyId(@PathParam("bookID") int bookId )
{
	return booksservice.getBooksById(bookId);
}
@PostMapping("/save")
private void saveBooks(@RequestBody Books books) {
	 booksservice.saveOrUpdate(books);
}
@PostMapping("/update")
private void updateBooks(@RequestBody Books books ,@RequestParam("bookid") int bookId) {
	booksservice.update(books,bookId);
	
}
}
