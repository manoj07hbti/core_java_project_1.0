package conditional_statements;

public class ConditionalDemo {

    public static void main(String[] args) {

        // if(expression ){ CODE }
        // else{CODE}

        int age=17;

        if (age >18){

            System.out.println("Person is Young ");
        }
        else
        {
            System.out.println("Person is Child ");
        }


        String city="Delhi";

        if( city=="Pune"){

            System.out.println("You are in Pune... ");
        }
        else {
            System.out.println("You are not  in Pune... ");
        }

    }
}
