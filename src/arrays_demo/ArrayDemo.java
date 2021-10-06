package arrays_demo;

public class ArrayDemo {

    public static void main(String[] args) {

        // SYNTAX of  Array : DataType [] variable_name={,,,};

       /* String name="Java";
        String name1="Spring";
        String name2="Spring Boot";
        String name3="Microservice";*/

        String [] nameArray= {"Java","Spring","Spring Boot","Microservice"};

        System.out.println(nameArray[0]);
        System.out.println(nameArray[1]);
        System.out.println(nameArray[2]);
        System.out.println(nameArray[3]);

        for(int i=0;i<nameArray.length;i++){
            System.out.println(nameArray[i]);
        }
        // ADVANCE FOR LOOP  SYNTAX  for(Datatype var_name: ArrayName){CODE}

        for(String var: nameArray){

            System.out.println("INSIDE ADVANCE FOR LOOP " +var);
        }

        int [] marksArray= {54,33,76,88,91,12,34,67};

        System.out.println(marksArray[0]);
        System.out.println(marksArray[1]);
        System.out.println(marksArray[2]);
        System.out.println(marksArray[3]);
        System.out.println(marksArray[4]);
        System.out.println(marksArray[5]);
        System.out.println(marksArray[6]);
        System.out.println(marksArray[7]);

        //TODO for loop

        //TODO marks array for loop

        double [] priceArray= {34.2,55.3,454.32,44.33,66.2,55.2};



    }
}
