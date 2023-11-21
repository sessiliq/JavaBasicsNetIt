package OOPConcepts;

import java.util.Scanner;

/*
Parent   | Child    | Keyword
Class    | Class    | extends
Interface| Interface| extends
Interface| Class    | implements
 */
public class Pet {

    //Create class Pet
    //What is it
        public String breed;
        public String name;
        public byte age;
        public String color;
        public float weight;
        public boolean isFemale;
        //constructor
        //How it's made
        public Pet(String breed, String name, byte age, String color, float weight, boolean isFemale){
            this.breed = breed;
            this.name = name;
            this.age = age;
            this.color = color;
            this.weight = weight;
            this.isFemale = isFemale;
        }
        //default constructor
        //How it's made
        public Pet(){

        }
        //method(describe action)
        //What does it do
        public void eat(){
            System.out.printf("%s is eating.\n", name);
        }
        //method(describe action)
        //What does it do
        public void makeNoise(){
            System.out.printf("%s is making noise.\n", name);
        }
       //this method prints all data for the pet
        public void printAllData(){
            System.out.printf("Name: %s\n", name);
            System.out.printf("Breed: %s\n", breed);
            System.out.printf("Age: %s\n", age);
            System.out.printf("Color: %s\n", color);
            System.out.printf("Weight: %s\n", weight);

            if (isFemale){
                System.out.printf("%s is female\n", name);
            }
            else {
                System.out.printf("%s is male\n", name);
            }
        }
        public void acceptDataFromConsole(){
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Please, enter your pet's breed:");
        breed = input.nextLine();

        System.out.println("Please, enter your pet's name:");
        name = input.nextLine();

        System.out.println("Please, enter your pet's age:");
        age = input2.nextByte();

        System.out.println("Please, enter your pet's color:");
        color = input.nextLine();

        System.out.println("Please, enter your pet's weight:");
        weight = input2.nextFloat();

        System.out.println("Please, enter if your pet is female or male:");
        String female = input.nextLine();

        if (female.equals("female")){
            isFemale = true;
        }
        else {
            isFemale = false;
        }
    }
}

