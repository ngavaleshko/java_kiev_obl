import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {

        System.out.println("You enter the radius of cylinder: "+ args[0] + " mm");
        int radius = Integer.parseInt(args[0]);
        System.out.println("You enter the height of cylinder: "+ args[1] + " mm");
        int height = Integer.parseInt(args[1]);

        double volume = Math.PI * radius * radius * height;

        System.out.println("Precise  value of cylinder volume is: " + volume + " mm cubic");
        System.out.println("Precise volume of cylinder is: " + volume/1_000_000_000 + " m cubic");
        System.out.println("Rounded volume of cylinder is: " + Math.round(volume/1_000_000) + " liters");

    }
}
