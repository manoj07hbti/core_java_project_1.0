package collection;

import java.util.ArrayList;

public class ListWithStudent {

    public  ArrayList <Student> createStudentList(){

        //  SYNTAX   : ArrayList < Datatype> OBJ_NAME=new ArrayList<> ()

        ArrayList <Student> studentArrayList= new ArrayList<>();

        // create student object
        Student student1= new Student("Raj",24,"CS");
        Student student2= new Student("Ravi",22,"IT");
        Student student3= new Student("Mohit",24,"IT");

        student3.setName("JAva");
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);




        return  studentArrayList;
    }

    public static void main(String[] args) {

        ListWithStudent obj= new ListWithStudent();
        ArrayList <Student> studentArrayList= obj.createStudentList();

        for(Student var: studentArrayList){

            System.out.println("Printing Student objects :" +var.getName());
            System.out.println("Printing Student objects :" +var.getAge());
        }
    }
}
