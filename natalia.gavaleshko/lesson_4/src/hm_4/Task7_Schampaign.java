package hm_4;

public class Task7_Schampaign {
    public static void main(String[] args) {
        double oneBottleVolume = 750;
        int people = Integer.valueOf(args[0]);
        System.out.println("Quantity of people: " + people);

        double champagneNeeds = (people * 100) / oneBottleVolume;
        double champagneBottles = Math.ceil(champagneNeeds);

        System.out.println("Quantity of champagne bottles? that people need: " + champagneBottles);

        double less = oneBottleVolume * (champagneBottles - champagneNeeds);
        System.out.printf("The rest of the champagne %.2f ml: ", less);
    }
}
