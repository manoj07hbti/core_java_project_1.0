package collection;

import java.util.ArrayList;

public class ListWithgenerics {

  public  ArrayList <String> demoGenericList(){

      // SYNTAX   : ArrayList < Datatype> OBJ_NAME=new ArrayList<> ()

      ArrayList <String> nameList= new ArrayList<>();
      nameList.add("Java");//0
      nameList.add("Spring");//1
      nameList.add("Spring Boot");//2


      return nameList;

  }


  public  ArrayList <Integer> IntegerList(){

      ArrayList <Integer> marksList= new ArrayList<>();
      marksList.add(76);
      marksList.add(87);
      marksList.add(56);

      return marksList;
  }


  //TODO SALARY method

    public static void main(String[] args) {

        ListWithgenerics obj=new ListWithgenerics();
       ArrayList<String> list= obj.demoGenericList();

       for(int i=0;i<list.size(); i++){

           System.out.println("Printing list with normal loop "+ list.get(i));
       }

        // SYNTAX  for(Datatype var_name: ArrayName/CollectionName){CODE}
        for (String var:list){

            System.out.println("Printing list in main method "+var);
        }

        // calling Integer List
        ArrayList <Integer> marksList=   obj.IntegerList();
        for (Integer var:marksList){

            System.out.println("Printing marks in main method "+var);
        }
    }





}
