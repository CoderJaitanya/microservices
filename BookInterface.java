package com.wipro.java.ms.inter;

public class BookInterface {
	public static void main(String[] args) {
        Book myBook = new Book("Java Programming", "John Doe", 29.99);
       
        myBook.displayDetails();
        myBook.updatePrice(34.99);
        myBook.displayDetails();
    }
}