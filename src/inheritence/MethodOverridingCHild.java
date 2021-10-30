package inheritence;

public class MethodOverridingCHild extends MethodOverridingParent{

    // overriding : override parent method by changing it's body

    // Syntax : access_specifier return_type  method_name (parameter) { BODY }
    @Override
    public void m1(){

        System.out.println("I am in M1 of Child Class");
    }


    public static void main(String[] args) {
        MethodOverridingCHild obj= new MethodOverridingCHild();
        obj.m1();

        MethodOverridingParent parent= new MethodOverridingCHild();
        parent.m1();

    }
}
