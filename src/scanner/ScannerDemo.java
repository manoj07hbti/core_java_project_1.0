package scanner;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object


        System.out.println("Please Enter username");
        // String input
        String userName = myObj.nextLine();  // Read user input
        System.out.println("You have entered Username as: " + userName);  // Output user input

        // Numerical input
        System.out.println("Please Enter your Age");
        int age = myObj.nextInt();

        System.out.println("You have entered Age as: " + age);

        System.out.println("Please Enter your  salary");
        double salary = myObj.nextDouble();
        System.out.println("YOu have entered Salary as : " + salary);

    }
}
