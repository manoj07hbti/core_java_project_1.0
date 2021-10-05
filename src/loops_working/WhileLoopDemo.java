package loops_working;

public class WhileLoopDemo {

    public static void main(String[] args) {

       /* SYNTAX : while (condition){
           code to be executed
           Increment / decrement statement
        } */

       int i=0;

       while (i<5){
           System.out.println("While Loop Demo "+i );
           i++;
           if(i==3){
               break;
           }
       }

       int j=5;
       while(j>0){
           System.out.println("Decrement While Loop Demo "+j );
           j--;

       }

    }
}
