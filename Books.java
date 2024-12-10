package javatask;


import java.util.*;

class Book {
    String title, author, ISBN;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }
}

public class Books {
    public static void main(String[] args) {
        
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("\t \t Book Store");
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n1. Add Book \t 2. Remove Book \t 3. View Books  \t4. Exit");
            System.out.println("\nEnter the option in Numbers: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    System.out.println("Enter the Title of the Book: ");
                    String title = sc.nextLine();
                    System.out.println("Enter the Author of the Book: ");
                    String author = sc.nextLine();
                    System.out.println("Enter the ISBN of the Book: ");
                    String ISBN = sc.nextLine();
                    books.add(new Book(title, author, ISBN));
                    System.out.println("The Book is Added Successfully");
                    break;
                }
                
                case 2: {
                    System.out.println("Enter ISBN to remove a Book: ");
                    String removeISBN = sc.nextLine();
                    books.removeIf(book -> book.ISBN.equals(removeISBN));
                    System.out.println("The Book" +removeISBN+ "is Successfully Removed");
                    break; 
                }
                
                case 3: {
                    if (books.isEmpty()) {
                        System.out.println("Sorry, No Books are Available.");
                    } else {
                        books.forEach(System.out::println);
                    }
                    break; 
                }
                
                case 4: {
                    System.out.println("Exiting the program...");
                    break; 
                }

                default:
                    System.out.println("Invalid option! Please choose Valid Option.");
                    break;
            }
            
        } while (choice != 4); 
        
        sc.close();
    }
}