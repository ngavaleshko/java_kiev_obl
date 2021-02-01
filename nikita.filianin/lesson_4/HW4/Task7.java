public class Task7 {
    public static void main(String[] args) {
        int amountOfPeople = Integer.parseInt(args[0]);
        int champagne = 750;
        int glassValue = 100;

        double howManyBottlesNeeded = (float) (amountOfPeople * glassValue) / champagne;
        int howMuchChampagneLeft = ((amountOfPeople * glassValue) - ((int) Math.ceil(howManyBottlesNeeded) * champagne)) * (-1);
        System.out.println("We need " + (int) Math.ceil(howManyBottlesNeeded) + " bottles of champagne. " + howMuchChampagneLeft + " milliliters of champagne remain.");
    }

}
public class Task7 {
    public static void main(String[] args) {
        int amountOfPeople = Integer.parseInt(args[0]);
        int champagne = 750;
        int glassValue = 100;

        double howManyBottlesNeeded = (float) (amountOfPeople * glassValue) / champagne;
        int howMuchChampagneLeft = ((amountOfPeople * glassValue) - ((int) Math.ceil(howManyBottlesNeeded) * champagne)) * (-1);
        System.out.println("We need " + (int) Math.ceil(howManyBottlesNeeded) + " bottles of champagne. " + howMuchChampagneLeft + " milliliters of champagne remain.");
    }

}
