package exception_handling;

public class Calculator {

    public void divide(int a, int b ){

        int result=0;
        try {
             result = a / b;
        }
        catch (Exception e){

            System.out.println("Exception occured "+e);
        }


        System.out.println("Divide is : "+result);
    }

    public static void main(String[] args) {
        Calculator obj= new Calculator();
        obj.divide(8,0);
    }
}
