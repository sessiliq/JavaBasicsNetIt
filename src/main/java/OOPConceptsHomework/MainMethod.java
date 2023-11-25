package OOPConceptsHomework;

public class MainMethod {
    public static void main(String[] args) {
        Dogs goshko = new Dogs("goshko", "german shepard", 12.5, false, 45,true,
                true);

        Dogs toshko = new Dogs("Toshko", "terier", 12.5, true, 45,false,
                false);

        Dogs peshko = new Dogs("Peshko", "bulldog", 12.5, true, 45,true,
                false);

        Dogs mishko = new Dogs("Mishko", "bulldog", 12.5, true, 45,false,
                true);

        Dogs greshno = new Dogs("","", -2, true, -5,true,
                false);

        goshko.printDogData();
        System.out.println("------------------");

        toshko.printDogData();
        System.out.println("------------------");

        peshko.printDogData();
        System.out.println("------------------");

        mishko.printDogData();
        System.out.println("------------------");greshno.printDogData();
        System.out.println("------------------");

    }
}
