public class Task6 {

    public static void main(String[] args) {
        int height = Integer.parseInt(args[0]);
        int radius = Integer.parseInt(args[1]);
        double cylinderVolume = Math.PI * radius * radius * height;


        System.out.println("Cylinder volume is : " + cylinderVolume);
    }
}
