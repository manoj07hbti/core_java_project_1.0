package loops_working;

public class LoopExercise {

    public static void main(String[] args) {

        int two=2;

       /* for (int i=1 ; i<=10 ; i++){

            int output= two*i;
            System.out.println("Printing table of 2: "+output);

        }*/
        int three=3;
        int i=1;
        while (i<=10){

            int output= two*i;
            System.out.print(" Table of Two " +output);
            System.out.print(" Table of Three " +three*i);
            i++;
        }


    }
}
