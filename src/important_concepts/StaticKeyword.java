package important_concepts;
/* todo static keyword: can be used by Class reference without creating objects : Compile time binding,
    static will get initialize while class loading (compile time )
    *** static method can not use non static data : non static data are object dependent but static can be called by class name only
    * static method can not be overridden: it will not give you error but there is no meaning of doing it
 */
public class StaticKeyword {

    int count=5;// not static

    static int value=5;// static data

    public static void display( int a){
        System.out.println("Value is ----"+a);
      //  System.out.println("Value is ----"+count);
     System.out.println(value);
    }
    public static void main(String args[]){
        System.out.println(StaticKeyword.value);
// SYNTAX: CLASSNAME.STATIC_VARIABLE or CLASSNAME>METHODNAME();
        StaticKeyword.display(9);// calling by class reference
        System.out.println("Value of variable  "+ StaticKeyword.value);// calling by class reference


    }

}
