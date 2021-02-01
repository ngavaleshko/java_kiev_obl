public class Drink {
    public static void main(String[] args) {

        System.out.println("Quantity of people is "+ args[0]);
        double quantityOfPeople = Double.parseDouble(args[0]);

        double quantityOfBottle = (100*quantityOfPeople)/750;
        double restOfChampagne = (Math.ceil(quantityOfBottle)*750)%(100*quantityOfPeople);

        System.out.println("You need " + Math.ceil(quantityOfBottle) + " bottle of Champagne!");
        System.out.println("You will have " + restOfChampagne + " ml rest of champagne!");
        System.out.println(restOfChampagne > 400 ? "It`s to much rest!" : "The rest of the champagne is ok!");

    }
}

