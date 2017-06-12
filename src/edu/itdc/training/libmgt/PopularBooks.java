package edu.itdc.training.libmgt;

public class PopularBooks extends Books {
	
	public PopularBooks (String bookId, String bookTitle, String bookAuthor, String publicationYear) {
		super (bookId, bookTitle, bookAuthor, publicationYear);
	}
	
	public PopularBooks (String bookId, String bookTitle, String bookAuthor, String publicationYear, String bookCategory, double price, String status) {
		super (bookId, bookTitle, bookAuthor, publicationYear, bookCategory, price, status);
	}
}
