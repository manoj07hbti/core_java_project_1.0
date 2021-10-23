package collection;

import java.util.HashMap;

public class HashMapDemo {

    public void createHashMap(){

        //Syntax:   HashMap <Key_DataType,Value_DataType> objName= new HashMap <> ();


        HashMap <Integer,String> obj= new HashMap<>();

        // for adding a value we use put method

        obj.put(1,"Agra");
        obj.put(2,"Delhi");
        obj.put(3,"Pune");

        // getting a value from HashMap by get

        System.out.println(obj.get(3));
        System.out.println(obj.get(2));
        System.out.println(obj.get(1));

        for (Integer var:obj.keySet()){

            System.out.println("Printing in Loops "+obj.get(var));
        }

    }

    public static void main(String[] args) {
        HashMapDemo obj=new HashMapDemo();
        obj.createHashMap();
    }

}



