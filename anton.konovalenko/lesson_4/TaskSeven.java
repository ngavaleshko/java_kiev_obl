public class TaskSeven {
    public static void main(String[] args) {
        int countOfPeople = Integer.parseInt(args[0]);
        int champagneBottle = 750;
        int glassValue = 100;

        double howManyBottlesNeeded = (float) (countOfPeople * glassValue) / champagneBottle;
        int howMuchChampagneLeft = ((countOfPeople * glassValue) - ((int) Math.ceil(howManyBottlesNeeded) * champagneBottle)) * -1;
        System.out.println("We need " + (int) Math.ceil(howManyBottlesNeeded) + " bottles of champagne. " + howMuchChampagneLeft + " milliliters of champagne will left.");
    }
}
