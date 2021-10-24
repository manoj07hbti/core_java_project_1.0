package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapWithStudents {


    public  HashMap <String, Student> createStudentHashMap(){


        //Syntax:   HashMap <Key_DataType,Value_DataType> objName= new HashMap <> ();

        HashMap <String, Student> studentHashMap= new HashMap<>();

        Student student1=new Student("Raj",24,"IT");

        studentHashMap.put("A",student1);

        Student student2 =new Student("Ramesh",23,"CS");

        studentHashMap.put("B",student2);

        return studentHashMap;
    }

    public void createMapWithListStudents(){
        //Syntax:   HashMap <Key_DataType,Value_DataType> objName= new HashMap <> ();
        HashMap <String, List<Student>> hashMap= new HashMap<>();
        Student student1=new Student("Raj",24,"IT");
        Student student2 =new Student("Ramesh",23,"CS");
        Student student3 =new Student("Mohit",23,"CS");

        ArrayList <Student> studentArrayList= new ArrayList<>();
        studentArrayList.add(student1);
        studentArrayList.add(student3);
        studentArrayList.add(student2);


        hashMap.put("A",studentArrayList);



           List <Student > list= hashMap.get("A");
           for(Student var: list){

               System.out.println("inside for loop "+var.getName());
           }

    }

    public static void main(String[] args) {

        HashMapWithStudents obj=new HashMapWithStudents();
        obj.createMapWithListStudents();
        HashMap <String, Student> studentHashMap= obj.createStudentHashMap();

        for (String var: studentHashMap.keySet()){

            System.out.println("Printing HashMap "+studentHashMap.get(var).getName());
            System.out.println("Printing HashMap "+studentHashMap.get(var).getBranch());
        }
    }

}
