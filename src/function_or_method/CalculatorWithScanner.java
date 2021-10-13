package function_or_method;

import java.util.Scanner;

public class CalculatorWithScanner {

    public int addition(int a, int b){

        int sum=a+b;

        return sum;
    }

    public int subtraction(int a, int b){

        int sub=a-b;

        return sub;
    }

    public int multi(int a, int b){

        int mult=a*b;

        return mult;
    }

    public int divide(int a, int b){

        int div=a/b;

        return div;
    }

    public static void main(String[] args) {

        CalculatorWithScanner obj= new CalculatorWithScanner();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Please enter Choice value of 1 for Addition, 2 for Subtraction, 3 for Multiplication and 4 for divide: ");
        int choice=myObj.nextInt();

        System.out.println("Please enter value of a: ");
        int a=myObj.nextInt();
        System.out.println("Please enter value of b: ");
        int b=myObj.nextInt();

        int result;
    if (choice==1){
        System.out.println("You have selected ADDITION ");
       result= obj.addition(a,b);
    }
    else if(choice==2)
    {
        System.out.println("You have selected SUBTRACTION ");
        result=obj.subtraction(a,b);
    }
    else if(choice==3){
        System.out.println("You have selected MULTIPLICATION ");
        result=obj.multi(a,b);
    }
    else {
        System.out.println("You have selected DIVIDE ");
        result= obj.divide(a,b);
    }

     System.out.println("Calculator result is " +result);


    }

}
