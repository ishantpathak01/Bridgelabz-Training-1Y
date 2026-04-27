package com.gla;
import com.gla.Category;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    try {
                        Book book = new Book();

                        System.out.print("Enter Book ID: ");
                        book.setId(sc.nextInt());
                        sc.nextLine();

                        System.out.print("Enter Title: ");
                        book.setTitle(sc.nextLine());

                        System.out.print("Enter Author: ");
                        book.setAuthor(sc.nextLine());

                        // 🔹 Category Selection
                        System.out.println("Select Category:");
                        for (Category c : Category.values()) {
                            System.out.println("- " + c);
                        }

                        String cat = sc.nextLine().toUpperCase();
                        book.setCategory(Category.valueOf(cat));

                        System.out.print("Enter Quantity: ");
                        int qty = sc.nextInt();

                        library.addBook(book, qty);

                    } catch (Exception e) {
                        System.out.println("Invalid input!");
                        sc.nextLine(); // clear wrong input
                    }
                    break;

                case 2:
                    library.displayBooks();
                    break;

                case 3:
                    try {
                        System.out.print("Enter Book ID to issue: ");
                        int id = sc.nextInt();
                        library.issueBook(id);
                    } catch (Exception e) {
                        System.out.println("Error issuing book!");
                    }
                    break;

                case 4:
                    try {
                        Book book = new Book();

                        System.out.print("Enter Book ID: ");
                        book.setId(sc.nextInt());
                        sc.nextLine();

                        System.out.print("Enter Title: ");
                        book.setTitle(sc.nextLine());

                        System.out.print("Enter Author: ");
                        book.setAuthor(sc.nextLine());

                        // 🔹 Category Selection
                        System.out.println("Select Category:");
                        for (Category c : Category.values()) {
                            System.out.println("- " + c);
                        }

                        String cat = sc.nextLine().toUpperCase();
                        book.setCategory(Category.valueOf(cat));

                        library.returnBook(book);

                    } catch (Exception e) {
                        System.out.println("Error returning book!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}