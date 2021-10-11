package class_and_object;

public class ParamConstructor {

    int age;
    String name;

   //parameterized constructor
    public ParamConstructor(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {

        ParamConstructor object= new ParamConstructor(23,"Java");

        System.out.println(object.age);
        System.out.println(object.name);

    }
}
