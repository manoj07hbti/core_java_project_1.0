package collection;

import java.util.ArrayList;

public class ListDemo {

    public void demo(){

      // SYNTAX   : ArrayList  OBJ_NAME=new ArrayList ()

        ArrayList list= new ArrayList();
        list.add("Java"); // 0 index
        list.add("Spring");// 1 index
        list.add("Spring Boot");// 2 index
        list.add("Cloud"); // 3 index

        System.out.println(list.get(1));

        System.out.println(list.get(3));

        System.out.println(list.get(0));


        for (int i=0; i<list.size();i++){

            System.out.println("Elements of List is "+ list.get(i));
        }

        // advanced for loop

        for(Object var: list ){

            System.out.println("inside advanced for loop "+var);
        }

        System.out.println( "List size is before delete " + list.size());

        list.remove(2);

        System.out.println(list.get(2));

        System.out.println( "List size is after remove " + list.size());



    }

    public static void main(String[] args) {

        ListDemo obj= new ListDemo();
        obj.demo();
    }


}
