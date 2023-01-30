package com.ironhack.ironLibrary.methods;

import java.util.Scanner;

public class MenuLogic {

static Scanner scanner = new Scanner(System.in);

    public static int readInt(int userChoices){
        int input;
        do {
            try {
                input = Integer.parseInt(scanner.next());
            } catch(Exception e) {
                input = -1;
                System.out.println("Please enter a valid option!");
            }
        } while (input < 1 || input > userChoices);

        return input;
    }

    public static void mainMenu() {
        System.out.println("What do you want to do?");
        System.out.println("(1) Add a book ");
        System.out.println("(2) Search book by title");
        System.out.println("(3) Search book by category");
        System.out.println("(4) Search book by Author");
        System.out.println("(5) List all books along with author");
        System.out.println("(6) Issue book to student");
        System.out.println("(7) List books by usn");
        System.out.println("(8) Exit");

        int selectedMenu = readInt(8);

        switch (selectedMenu) {
            case 1:

                //addBookMenu(se piden las variables x pantalla)
                // dentro se llama a addbook(var1,var2..)

                //el método recibe y crea (no devuelve)
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:
                System.out.println("Thanks for using ironLibrary");
                System.exit(0);
            default:

        }
    }
}


