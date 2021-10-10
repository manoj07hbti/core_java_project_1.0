package function_or_method;

public class Calculator {



    // addition , subtraction , divide , multiplication
    // Syntax : access_specifier return_type  method_name (parameter) {}

    public void addition (int a, int b){

        int sum;
        sum=a+b;// addition
        System.out.println("This is addition method ..." +sum);

    }

    public void subtraction(){

      //  int sub=a-b;
    // System.out.println("This is Subtraction Method ....." +sub);
    }

    public void multiplication(){

     //   int mul= a*b;
     //   System.out.println("This is Multiplication method...." +mul);
    }


    public static void main(String[] args) {

        // how to call method
        // step 1- create object : SYNTAX  ClassName objectName= new ClassName();
        // step 2 objectName.methodName();
        Calculator object= new Calculator(); // step 1
        object.addition(10,5); // step 2
        /*object.subtraction();// step 2
        object.multiplication();// step 2*/

    }

}
