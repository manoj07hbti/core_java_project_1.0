package class_and_object;

public class Calculator {

    // data member
    int a;
    int b;

    // addition , subtraction , divide , multiplication
    // Syntax : access_specifier return_type  method_name (parameter) {}

    public void addition (){

        System.out.println("This is addition method ...");
    }

    public static void main(String[] args) {

        // how to call method
        // step 1- create object : SYNTAX  ClassName objectName= new ClassName();
        // step 2 objectName.methodName();
        Calculator object= new Calculator();
        object.addition();

    }

}
