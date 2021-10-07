package class_and_object;

public class Book {

    //properties or data member
    private String name="Java";
    int pages=530;
    String writer_name="James Gosling";
/* todo    Member function or method -- capabilities
            // Syntax : access_specifier return_type  method_name (parameter) {}
             //access_specifier -> public , private , protected, default   THEORY PART
            //return_type   -> output of function or method :  void : no return type
            //method_name -> can be anything: it should be meaningful
            // parameter ->  input parameter : optional
      */
    // methods or capabilities

    // Syntax : access_specifier return_type  method_name (parameter) {}

    public void read(){

        System.out.println("This is read Method .......");
    }

    public void write (){

        System.out.println("This is write  Method .......");
    }


    public static void main(String[] args) {

        // how to call method
        // step 1- create object : SYNTAX  ClassName objectName= new ClassName();

        Book object= new Book();

        // step 2 objectName.methodName();

        object.read();
        object.write();

    }
}
