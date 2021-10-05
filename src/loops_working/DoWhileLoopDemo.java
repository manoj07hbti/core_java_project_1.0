package loops_working;

public class DoWhileLoopDemo {

    public static void main(String[] args) {


        /* SYNTAX
        do{
          code to be executed / loop body
          update statement
          }while (condition);
         */

        int i=0;

        do {
            System.out.println("Inside Do while Loop "+i);
            i++;
        }
        while (i<5);

        int j=5;

        do {
            System.out.println("Inside Do while Decrement Loop "+j);
            j--;
        }while (j>0);
    }
}
