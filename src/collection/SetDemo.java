package collection;

import java.util.HashSet;

public class SetDemo {

    public void createSet(){

        // HashSet <DataType>  obj_name= new HashSet <> ();

        HashSet <String> names= new HashSet<>();

        names.add("Java");
        names.add("Spring");
        names.add("Spring");
        names.add("Spring Boot");
        names.add("Java");

        for( String var: names){

            System.out.println("Printing set "+var);
        }

        HashSet <Integer> ages= new HashSet<>();

        ages.add(24);
        ages.add(25);
        ages.add(24);
        ages.add(25);
        ages.add(24);
        ages.add(25);

        for (Integer var: ages){

            System.out.println("Printing Ages..."+var);
        }


    }

    public static void main(String[] args) {

        SetDemo obj= new SetDemo();
        obj.createSet();
    }
}
