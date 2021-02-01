public class Task6 {
    public static void main(String[] args) {

        double cylinderHeight = Double.parseDouble(args[0]);
        double cylinderRadius = Double.parseDouble(args[1]);

        double cylinderVolume = Math.PI * Math.pow(cylinderRadius,2) * cylinderHeight;
        System.out.println("Cylinder volume is: " + cylinderVolume);



    }
}
