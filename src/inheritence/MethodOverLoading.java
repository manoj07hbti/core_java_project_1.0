package inheritence;

public class MethodOverLoading {

       /* todo    Member function or method -- capabilities
            // Syntax : access_specifier return_type  method_name (parameter) {}
      */

       public void m1(){

           System.out.println("I am in M1");
       }
// overloading with one int parameter
       public void m1(int a){

           System.out.println("I am in overloaded method M1");
       }

       // overloading with one int parameter and one String parameter
    public void m1(int a,String s){

        System.out.println("I am in overloaded method M1");
    }


    public static void main(String[] args) {

           MethodOverLoading obj = new MethodOverLoading();

           obj.m1();
           obj.m1(3);
           obj.m1(2,"Java");
    }
}
