package com.librarymanagement.first;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations op = new Operations();
        StudentOp stOp = new StudentOp();

        boolean start = true;

        System.out.println("=== Welcome to Library Management System ===");

        while (start) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Set Book Details");
            System.out.println("2. View Book Info");
            System.out.println("3. Issue Book");
            System.out.println("4. Submit Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    op.setBook();
                    break;

                case 2:
                    op.getBook();
                    break;

                case 3:
                    stOp.issueBook();
                    break;

                case 4:
                    stOp.SubmitBook();
                    break;

                case 5:
                    System.out.println("Exiting Library Management System...");
                    start = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}
