package com.gla;

public class LibraryService {

   private Library library;

   // 🔹 Set Library reference
   public boolean setRepository(Library library) {
      try {
         if (library == null) {
            throw new NullPointerException("Library cannot be null");
         }
         this.library = library;
         return true;

      } catch (Exception e) {
         System.out.println("Error: " + e.getMessage());
         return false;
      }
   }

   // 🔹 Issue Book
   public boolean issueBook(Book book) {
      try {
         if (book == null) {
            throw new NullPointerException("Book cannot be null");
         }

         library.issueBook(book.getId());
         return true;

      } catch (Exception e) {
         System.out.println("Error issuing book: " + e.getMessage());
         return false;
      }
   }

   // 🔹 Return Book
   public boolean returnBook(Book book) {
      try {
         if (book == null) {
            throw new NullPointerException("Book cannot be null");
         }

         library.returnBook(book);
         return true;

      } catch (Exception e) {
         System.out.println("Error returning book: " + e.getMessage());
         return false;
      }
   }
}