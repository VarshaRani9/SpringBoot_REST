package com.xyz.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.example.entities.Book;
import com.xyz.example.repository.BookRepository;

@Service
public class BookService {

//	private static List<Book> list = new ArrayList<>();
//	static {
//		list.add(new Book(12, "Java", "Xyz"));
//		list.add(new Book(13, "JavaScript", "Abc"));
//		list.add(new Book(14, "Spring boot", "Mno"));
//	}
	
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAllBooks(){
//		return list;
		List<Book> list= (List<Book>)this.bookRepository.findAll();
		return list;
	}
	
	public Book getBookById(int id){
		Book book = null;
		try {
//			book = list.stream().filter(e->e.getId()==id).findFirst().get();
			book = this.bookRepository.findById(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return book;
	}
	
	public Book addBook(Book b) {
//		list.add(b);
//		return b;
		Book res = bookRepository.save(b);
		return res;
	}
	
	public void deleteBook(int bid) {
//		list=list.stream().filter(book-> book.getId()!=bid).collect(Collectors.toList());
		bookRepository.deleteById(bid);
	}
	
	public void updateBook(Book book, int bookId) {
//		list = list.stream().map(b->{
//			if(b.getId()==bookId) {
//				b.setTitle(book.getTitle());
//				b.setAuthor(book.getAuthor());
//			}
//			return b;
//		}).collect(Collectors.toList());
		book.setId(bookId);
		bookRepository.save(book);
	}
}
