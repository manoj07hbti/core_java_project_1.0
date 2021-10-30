package inheritence;

public class MethodOverridingParent {


    public void m1(){

        System.out.println("I am in M1 of Parent Class");
    }

    public static void main(String[] args) {

        MethodOverridingParent obj= new MethodOverridingParent();
        obj.m1();
    }
}
