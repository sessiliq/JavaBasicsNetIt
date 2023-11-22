package OOPConceptsHomeExercise;

import java.util.Scanner;

public class Positions {
    //private variables for the class
    private String name;
    private String position;
    private int age;

    //constructor
    Positions(String name, String position, int age){
        setName(name);
        setPosition(position);
        setAge(age);
    }
    Positions(){

    }
    //methods for setting values of the private variables
    public void setName(String newName){
        this.name = newName;
    }
    public void setPosition(String newPosition){
        this.position = newPosition;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    //methods for getting private variables values
    public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
    public int getAge(){
        return age;
    }
    //method for accepting data from the console
    public void acceptDataFromConsole(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter name:");
        setName(input.nextLine());
        System.out.println("Please, enter position:");
        setPosition(input.nextLine());
        System.out.println("Please, enter age:");
        setAge(input.nextInt());
    }
    public void printData(){
        System.out.printf("Name: %s Position: %s Age: %d\n", getName(), getPosition(), getAge());
    }
}
