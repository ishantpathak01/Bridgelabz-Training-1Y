package com.gla;

public class LibraryRepository {

   public void save(Book book) {
      System.out.println("Saving book: " + book.getTitle());
   }
}