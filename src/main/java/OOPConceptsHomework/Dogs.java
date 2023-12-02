package OOPConceptsHomework;

public class Dogs extends Pet{
    //variables specific for class Dog
    private boolean hasLongFur;
    private boolean hasTail;

    //constructor for class Dog
    public Dogs(String name, String breed, double age, boolean isMale, float weight, boolean hasTail, boolean hasLongFur) {
        super(name, breed, age, isMale, weight);
        this.hasTail = hasTail;
        this.hasLongFur = hasLongFur;
    }

    public boolean isHasLongFur() {
        return hasLongFur;
    }

    public void setHasLongFur(boolean hasLongFur) {
        this.hasLongFur = hasLongFur;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public void printDogData(){
        printAllData();
        if (hasTail && hasLongFur){
            System.out.printf("%s has tail and long fur.\n", getName());
        }
        else if(hasTail){
            System.out.printf("%s has tail and short fur.\n", getName());
        }
        else if (hasLongFur){
            System.out.printf("%s has long fur and no tail..\n", getName());
        }
        else {
            System.out.printf("%s short fur and no tail\n", getName());        }
    }
    public void makeNoise(){
        System.out.printf("%s is barking.\n", getName());
    }
}
