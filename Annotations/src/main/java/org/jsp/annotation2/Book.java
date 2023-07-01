package org.jsp.annotation2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book 
{
	
	private String bookname;
	private int bookId;
	private double price;
	private Author author;
	
	public String getBookname() {
		return bookname;
	}
	@Value("Java")
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	public int getBookId() {
		return bookId;
	}
	@Value("101")
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public double getPrice() {
		return price;
	}
	@Value("549.34")
	public void setPrice(double price) {
		this.price = price;
	}
	public Author getAuthor() {
		return author;
	}
	@Autowired
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
}
