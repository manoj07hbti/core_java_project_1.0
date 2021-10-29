package inheritence;

public class A {

    public void m1(){
        System.out.println("I am in method m1 of A class");
    }
    public void m2(){
        System.out.println("I am in method m2 of A class");
    }


    public static void main(String[] args) {
        A obj=new A();
        obj.m1();
    }
}
