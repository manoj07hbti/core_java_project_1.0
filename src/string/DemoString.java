package string;

public class DemoString {


    public static void main(String[] args) {

        String s="ABC";
        String s1=new String("ABC");
        String s2=new String ("ABC");

        String s4="ABC";

        if(s==s4){

                System.out.println("Both s,s4 are on same memory address ");

        }

        // == operator it checks memory address

        if(s==s1){
            System.out.println("Both are on same memory address ");
        }

        if(s1==s2){
            System.out.println("Both s1,s2 are on same memory address ");
        }
        // equal()  it check content of String

        if(s.equals(s1)){

            System.out.println("Both are Having same Data or content  ");
        }


    }
}
