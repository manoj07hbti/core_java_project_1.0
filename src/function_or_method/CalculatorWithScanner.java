package function_or_method;

import java.util.Scanner;

public class CalculatorWithScanner {

    public int addition(int a, int b){

        int sum=a+b;

        return sum;
    }


    public static void main(String[] args) {

        CalculatorWithScanner obj= new CalculatorWithScanner();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter value of a: ");
        int a=myObj.nextInt();
        System.out.println("Please enter value of b: ");
        int b=myObj.nextInt();

       int result = obj.addition(a,b);

       System.out.println("Addition is "+result);
    }

}
