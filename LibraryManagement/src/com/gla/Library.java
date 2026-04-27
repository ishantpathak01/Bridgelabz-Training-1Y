package com.gla;

import java.util.*;

public class Library {

   private List<Book> books = new ArrayList<>();
   private Admin admin;

   LibraryRepository libraryRepository = new LibraryRepository();

   // 🔹 Add Book with try-catch
   public void addBook(Book book, int quantity) {
      try {
         if (book == null) {
            throw new NullPointerException("Book cannot be null");
         }

         if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
         }

         for (int i = 0; i < quantity; i++) {
            books.add(book);
         }

         libraryRepository.save(book);
         System.out.println("Book added successfully!");

      } catch (NullPointerException e) {
         System.out.println("Error: " + e.getMessage());
      } catch (IllegalArgumentException e) {
         System.out.println("Error: " + e.getMessage());
      } catch (Exception e) {
         System.out.println("Unexpected error occurred!");
      }
   }

   // 🔹 View all books
   public void displayBooks() {
      if (books.isEmpty()) {
         System.out.println("No books available");
         return;
      }

      for (Book b : books) {
         System.out.println(
                 "ID: " + b.getId() +
                         ", Title: " + b.getTitle() +
                         ", Author: " + b.getAuthor() +
                         ", Category: " + b.getCategory()
         );
      }
   }

   // 🔹 Issue Book
   public void issueBook(int bookId) {
      try {
         Iterator<Book> iterator = books.iterator();

         while (iterator.hasNext()) {
            Book b = iterator.next();
            if (b.getId() == bookId) {
               iterator.remove();
               System.out.println("Book issued successfully!");
               return;
            }
         }

         throw new Exception("Book not available");

      } catch (Exception e) {
         System.out.println("Error: " + e.getMessage());
      }
   }
   public void returnBook(Book book) {
      try {
         if (book == null) {
            throw new NullPointerException("Book cannot be null");
         }

         books.add(book);
         System.out.println("Book returned successfully!");

      } catch (Exception e) {
         System.out.println("Error: " + e.getMessage());
      }
   }
}