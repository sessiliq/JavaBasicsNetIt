package OOPConceptsHomeExercise;

public class mainMethod {
    public static void main(String[] arg){
        Positions test = new Positions("test", "position", 12);
        PositionQA ese = new PositionQA("test", "test", 14, "Software Academy",
                false);

        test.acceptDataFromConsole();
        test.printData();

        ese.fillDataForCurrentClass();
        ese.printDataForCurrentClass();

    }
}
