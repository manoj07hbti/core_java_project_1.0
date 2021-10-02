package conditional_statements;

public class NestedIf {

    public static void main(String[] args) {


        int a=5;
        int b=0;


        if (a>0 && b>0){

            if(a==5) {
                System.out.println("a,b is greater than 0");
            }
        }
        else
        {

            System.out.println("a,b is NOT greater than 0");
        }

        if (a>40 || b>1){

            System.out.println("OR OPERATOR true block");
        }
        else
        {

            System.out.println("OR OPERATOR FALSE block");
        }

        if (a==4 && b==0){
            System.out.println("AND OPERATOR true block");
        }
        else {
            System.out.println("AND OPERATOR false block");
        }

    }
}
