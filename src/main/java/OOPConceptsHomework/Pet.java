package OOPConceptsHomework;

public class Pet {
    private String name;
    private String breed;
    private double age;
    private boolean isMale;
    private float weight;

    //setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }
        else {
            System.out.println("Name must be entered!");
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (!name.isEmpty()){
            this.breed = breed;
        }
        else {
            System.out.println("Breed must be entered!");
        }
    }

    public double getAge() {
       return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("Invalid age!");
        }
        else {
            this.age = age;
        }
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        this.isMale = isMale;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight < 0){
            System.out.println("Invalid weight!");
        }
        else {
            this.weight = weight;
        }
    }


    //constructor
    public Pet (String name, String breed, double age, boolean isMale, float weight){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.isMale = isMale;
        this.weight = weight;
    }

    //method that prints all data

    public void printAllData(){

        if (isMale){
            System.out.printf("%s is a %s breed and %.2f years old. It is male and weights  %.2fkg.\n",getName(), getBreed(),
                    getAge(), getWeight());
        }
        else {
            System.out.printf("%s is a %s breed and  %.2f years old. It is female and weights  %.2fkg.\n",getName(), getBreed(),
                    getAge(), getWeight());
        }

    }
    public void makeNoise(){
        System.out.printf("%s is making noises.\n", name);
    }
}
