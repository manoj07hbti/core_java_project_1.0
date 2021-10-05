package loops_working;

public class LoopsDemo {

    public static void main(String[] args) {


        // SYNTAX: for ( variable initialization ; condition ; increment ) {CODE}
        // increment for loop
        for (int i=0; i<5; i++){
            System.out.println("Hello..." +i);
            if(i==2){
                break;
            }
        }

        // SYNTAX: for ( variable initialization ; condition ; decrement ) {CODE}
        // decrement for loop

        for (int j=5; j>0 ; j--){

            System.out.println("Decrement for loop ...Hello..." +j);
            if(j==2){
                break;
            }
        }
    }
}
