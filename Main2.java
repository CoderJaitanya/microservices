package com.wipro.java.ms.s;

public class Main2 {
	public static void main(String[] args) {
        // Creating a book object
        Book2 book = new Book2("Java Programming", "John Doe", 2021, 1000, "123-456-789");

        // Creating an invoice for the book
        Invoice invoice = new Invoice(book, 2, 0.10, 0.05);

        // Printing the invoice
        InvoicePrinter printer = new InvoicePrinter();
        printer.print(invoice);

        // Saving the invoice to a file
        InvoicePersistence persistence = new InvoicePersistence();
        persistence.saveToFile(invoice, "invoice.txt");
    }
}
