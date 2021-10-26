package exception_handling;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Calculator {

    public void divide(int a, int b ){

        int result=0;
        try {
             result = a / b;
        }
        catch (Exception e){

            System.out.println("Exception occured "+e);
        }
        finally {
            System.out.println("This is finally block and it is going to execute every time ");
        }

        System.out.println("Divide is : "+result);
    }

    public void divideWithThrows (int a, int b) throws ArithmeticException {

        int result=a/b;
        System.out.println("inside divideWithThrows : "+ result);
    }

    public void addition(int a, int b ) throws Exception {

        int result=a+b;
        throw new Exception();
    }

    public static void main(String[] args) {
        Calculator obj= new Calculator();
        obj.divide(8,2);

        try {
            obj.divideWithThrows(6, 0);
        }
        catch (Exception e){

            System.out.println("Exception Occured ");
        }


        try {
            obj.addition(2,4);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
