package function_or_method;

public class FunctionWithInPutParam {
    /* todo    Member function or method -- capabilities
            // Syntax : access_specifier return_type  method_name (parameter) {}
             //access_specifier -> public , private , protected, default   THEORY PART
            //return_type   -> output of function or method :  void : no return type
            //method_name -> can be anything: it should be meaningful
            // parameter ->  input parameter : optional
      */

    // Syntax : access_specifier return_type  method_name (Datatype variable_name) {}

    public void  Hello(String name){

        System.out.println("This is Hello Method......" +name);
    }

    public void test(int a, String name){
        a=a+1;
        System.out.println("This is Test method " +a +" " + name);
    }

    public void check(int a){

        if(a>0){
            System.out.println(" Entered number is greater than Zero...." +a);
        }
        else {
            System.out.println(" Entered number is NOT greater than Zero...."+a);
        }

    }

    public static void main(String[] args) {
        FunctionWithInPutParam object=new FunctionWithInPutParam();

        object.Hello("Java");
        object.test(3,"Spring");
        object.check(5);
        object.check(-3);

    }

}
