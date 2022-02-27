package Decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestDecorator {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int choice;
        do{
                System.out.print("___________Library___________\n");
                System.out.print(" 1. Books \n");
                System.out.print(" 2. RomanianBook \n");
                System.out.print(" 3. UniversalBook \n");
                System.out.print(" 4. Exit \n");
                System.out.print("Enter your choice: ");
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                choice =Integer.parseInt(br.readLine());
                switch (choice) {
                    case 1 -> {
                        Books book1 = new Books();
                        System.out.println(book1.buyBook());
                        System.out.println(book1.bookPrice());
                    }
                    case 2 -> {
                        Library book2 = new RomanianBook(new Books());
                        System.out.println(book2.buyBook());
                        System.out.println(book2.bookPrice());
                    }
                    case 3 -> {
                        Library book3 = new UniversalBook(new Books());
                        System.out.println(book3.buyBook());
                        System.out.println(book3.bookPrice());
                    }
                    default -> {
                        {
                            System.out.println("Other than these no books available");
                        }
                        return;
                    }
                }

            }while(true);
        }
    }

