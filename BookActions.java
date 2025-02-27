package com.wipro.java.ms.inter;

public interface BookActions {
    void displayDetails();
    void updatePrice(double newPrice);
}

class Book implements BookActions {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
        System.out.println("Updated price: $" + price);
    }
}