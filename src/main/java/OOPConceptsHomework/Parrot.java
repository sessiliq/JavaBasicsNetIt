package OOPConceptsHomework;

public class Parrot extends Pet{
    private boolean isSpeaking;

    public Parrot (String name, String breed, double age, boolean isMale, float weight, boolean isSpeaking){
        super(name, breed, age, isMale, weight);
        setSpeaking(isSpeaking);
    }

    public boolean isSpeaking() {
        return isSpeaking;
    }

    public void setSpeaking(boolean IsSpeaking) {
        isSpeaking = IsSpeaking;
    }
    public void makeNoise(){
        if (!isSpeaking){
            System.out.printf("%s cannot speak.\n", getName());
        }
        else {
            System.out.printf("%s can speak.\n", getName());
        }
    }
}
