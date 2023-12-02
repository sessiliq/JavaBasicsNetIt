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
        if (!breed.isEmpty()){
            this.breed = breed;
        }
        else {
            System.out.println("Breed must be entered!");
        }
    }

    public double getAge() {
       return age;
    }

    public void setAge(double age) {
        if (age > 0){
            this.age = age;
        }
        else {
            System.out.println("Invalid age!");
        }
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        this.isMale = male;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight!");
        }
    }

    //constructor
    public Pet (String name, String breed, double age, boolean isMale, float weight){
        setName(name);
        setBreed(breed);
        setAge(age);
        setMale(isMale);
        setWeight(weight);
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
