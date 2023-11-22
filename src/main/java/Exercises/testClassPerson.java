package Exercises;

import java.util.Scanner;

public class testClassPerson {
    private String name;
    private int age;

    public String GetName(){
     return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public static void main(String[] args){
        testClassPerson gosho = new testClassPerson();
        gosho.setName("Gosho");
        gosho.setAge(18);

        System.out.println(gosho.GetName());
        System.out.println(gosho.getAge());

    }
}

