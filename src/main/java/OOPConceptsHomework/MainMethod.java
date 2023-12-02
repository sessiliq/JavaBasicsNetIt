package OOPConceptsHomework;

public class MainMethod {
    public static void main(String[] args) {

        Dogs goshko = new Dogs("goshko", "german shepard", 12.5, false, 45, true,
                true);

        goshko.printDogData();
        System.out.println("------------------");

        Dogs toshko = new Dogs("Toshko", "terier", 12.5, true, 45, false,
                false);

        toshko.printDogData();
        System.out.println("------------------");

        Dogs peshko = new Dogs("Peshko", "bulldog", 12.5, true, 45, true,
                false);

        peshko.printDogData();
        System.out.println("------------------");

        Dogs mishko = new Dogs("Mishko", "bulldog", 12.5, true, 45, false,
                true);

        mishko.printDogData();
        System.out.println("------------------");

        Dogs greshno = new Dogs("", "", -2, true, -5, true,
                false);

        greshno.printDogData();
        System.out.println("------------------");

        Pet test = new Pet("", "", -2, true, -5);

        test.printAllData();
        System.out.println("------------------");

        Parrot loli = new Parrot("Loli", "green parrot", 2, false, (float) 2.5, false);

        loli.printAllData();
        loli.makeNoise();
        System.out.println("------------------");

        Parrot teddy = new Parrot("Teddy", "Arra", 3.5, true, (float) 1.5, true);

        teddy.printAllData();
        teddy.makeNoise();
        System.out.println("------------------");
    }
}
