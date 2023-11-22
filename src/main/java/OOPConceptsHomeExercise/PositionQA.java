package OOPConceptsHomeExercise;

import java.util.Scanner;

public class PositionQA extends Positions {
    private String academy;
    private boolean isAutomation;
    //constructor include specific variables for the class
    PositionQA(String name, String position, int age, String academy, boolean isAutomation){
        super(name, position, age);
        this.academy = academy;
        this.isAutomation = isAutomation;
    }
    public void fillDataForCurrentClass(){
        acceptDataFromConsole();
        Scanner input2 = new Scanner(System.in);

        System.out.println("Please, enter your academy:");
        academy = input2.nextLine();
        System.out.println("Are you automation QA?");
        String isItAutomation = input2.nextLine();

        if (isItAutomation.equals("yes")){
            isAutomation = true;
        }
        else{
            isAutomation = false;
        }
    }
    public void printDataForCurrentClass(){
        printData();
        System.out.printf("%s studied at %s ",getName(), academy);

        if (isAutomation){
            System.out.printf("%s is automation QA", getName());
        }
        else {
            System.out.printf("%s is manual QA", getName());
        }
    }

}
