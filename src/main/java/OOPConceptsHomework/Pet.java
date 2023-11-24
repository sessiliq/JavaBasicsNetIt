package OOPConceptsHomework;

public class Pet {
    private String name;
    private String breed;
    private double age;
    private boolean isMale;
    private float weight;
    private String sex;
    //constructor
    public Pet (String name, String breed, double age, boolean isMale, float weight){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.isMale = isMale;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }
        else {
            System.out.println("Name must be entered!");
        }
    }

    private String getBreed() {
        return breed;
    }

    private void setBreed(String breed) {
        if (!name.isEmpty()){
            this.breed = breed;
        }
        else {
            System.out.println("Breed must be entered!");
        }
    }

    private double getAge() {
       return age;
    }

    private void setAge(int age) {
        if (age < 0){
            System.out.println("Invalid age!");
        }
        else {
            this.age = age;
        }
    }
    private boolean isMale() {
        return isMale;
    }

    private void setMale(boolean male) {
        if (sex.equals("male")){
            isMale = true;
        }
        else if (sex.equals("female")){
            isMale = false;
        }
        else {
            System.out.println("Invalid entry for sex!");
        }
    }

    private float getWeight() {
        return weight;
    }

    private void setWeight(float weight) {
        this.weight = weight;
    }

    //method that prints all data

    public void printAlldata(){
        System.out.printf("%s is a %s breed and %f years old. It is %s and weights %f\n",name, breed,
                age, sex, weight);
    }
    public void makeNoise(){
        System.out.printf("%s is making noises\n", name);
    }
}
