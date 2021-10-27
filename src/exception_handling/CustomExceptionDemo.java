package exception_handling;

import java.util.Scanner;

public class CustomExceptionDemo {


    public void verifyAge(int age) throws InvalidAgeException {

        if (age<18){

            throw new InvalidAgeException("You are not eligible for Voting as your age is less than 18..");
        }
        else
        {
            System.out.println("Welcome to Voting System");
        }
    }

    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Please Enter your Age for Voting ");
        int age = myObj.nextInt();

        CustomExceptionDemo obj=new CustomExceptionDemo();
        try {
            obj.verifyAge(age);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }

    }
}
