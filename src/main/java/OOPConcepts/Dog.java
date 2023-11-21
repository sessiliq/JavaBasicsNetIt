package OOPConcepts;

import java.util.Scanner;

public class Dog extends Pet {

    //Extend with something specific for the type Pet - Dog
    public boolean hasTail;

    //making new constructor with specific characteristic
    public Dog(String breed, String name, byte age, String color, float weight, boolean isFemale, boolean hasTail){
        super(breed, name, age, color, weight, isFemale);
        this.hasTail = hasTail;
    }
    //default constrictor calling default constructor from Pet
    public Dog(){
        super();
    }
    //method override - upgrade the main action
    //must have the same name
    //give us particular noise
    public void makeNoise(){
        System.out.printf("%s is barking.\n", name);
    }
    //Print all data + new characteristic - has tail
    public void printAllData2(){
        printAllData();

        System.out.printf("%s is barking\n", name);

        if (hasTail){
            System.out.printf("%s has tail\n", name);
        }
        else {
            System.out.printf("%s doesn't have tail\n", name);
        }
    }
    public void acceptDataFromConsole2(){
        acceptDataFromConsole();
        Scanner thisInput = new Scanner(System.in);
        System.out.println("Please, enter if your pet has tail:");
        String tail = thisInput.nextLine();
        boolean enteredHasTail;
        if (tail.equals("yes")){
            enteredHasTail = true;
        }
        else {
            enteredHasTail = false;
        }
    }


}
