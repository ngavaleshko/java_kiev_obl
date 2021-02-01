
public class Hipotenusa {
    public static void main(String[] args) {
        System.out.println("You enter the first leg: "+ args[0] + " mm");
        double firstLeg = Double.parseDouble(args[0]);
        System.out.println("You enter the second lag: "+ args[1] + " mm");
        double secondLeg = Double.parseDouble(args[1]);

        double hipo = Math.sqrt(Math.pow(firstLeg, 2) +
                Math.pow(secondLeg, 2));
        double hipo1 = Math.sqrt(firstLeg * firstLeg +
                secondLeg * secondLeg);
        double hipo2 = Math.hypot(firstLeg, secondLeg);

        System.out.println("Check 1. Use Math.sqrt & Math.pow. The hypotenuse is equals: " + hipo + " mm");
        System.out.println("Check 2. Use Math.sqrt & (n * n). The hypotenuse is equals: " + hipo1 + " mm");
        System.out.println("Check 3. Use Math.hypot. The hypotenuse is equals: " + hipo2 + " mm");
    }
}
