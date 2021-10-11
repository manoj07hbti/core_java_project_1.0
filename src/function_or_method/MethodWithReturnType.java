package function_or_method;

public class MethodWithReturnType {

    // Syntax : access_specifier return_type  method_name (Datatype variable_name) {}

    public String demoString(){

        String message="Hello Java";

       // System.out.println(message);

        return message;
    }

    public int demoInt(){

        int age=23;

        return age;
    }

    public String demo(String var){

        String output= var+ " Welcome to Return Type Method ....";

        return output;
    }

    public static void main(String[] args) {

        MethodWithReturnType object= new MethodWithReturnType();

       String output= object.demoString();

       System.out.println("Inside Main method "+output);

       int var_age= object.demoInt();

        System.out.println("Inside Main method "+var_age);


        String var= object.demo("Himani");
        System.out.println("Output is .."+var);
    }
}
