package OOPConceptsHomework;

public class Dogs extends Pet{
    private boolean hasLongFur;
    private boolean hasTail;
    private String hasFur;
    private String tail;


    public Dogs(String name, String breed, double age, boolean isMale, float weight, boolean hasTail, boolean hasLongFur) {
        super(name, breed, age, isMale, weight);
        this.hasTail = hasTail;
        this.hasLongFur = hasLongFur;
    }

    private boolean isHasLongFur() {
        return hasLongFur;
    }

    private void setHasLongFur(boolean hasLongFur) {
       if (hasFur.equals("yes")){
           hasLongFur = true;
       }
       else if (hasFur.equals("no")) {
           hasLongFur = false;
       }
       else {
           System.out.println("Invalid entry");
       }
    }

    private boolean isHasTail() {
        return hasTail;
    }

    private void setHasTail(boolean hasTail) {
        if (tail.equals("yes")){
            hasTail = true;
        }
        else if (tail.equals("no")) {
            hasTail = false;
        }
        else {
            System.out.println("Invalid entry");
        }
    }
    public void printDogData(){
        printAlldata();
        if (hasTail && hasLongFur){
            System.out.printf("%s has tail and long fur\n", getName());
        }
        else if(hasTail){
            System.out.printf("%s has tail and short fur\n", getName());
        }
        else if (hasLongFur){
            System.out.printf("%s has long fur and no tail\n", getName());
        }
        else {
            System.out.printf("%s short fur and no tail\n", getName());        }
    }
    public void makeNoise(){
        System.out.printf("%s is barking\n", getName());
    }
}
