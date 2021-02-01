public class SixCylinder {
    public static void main(String[] args) {
        int height = Integer.parseInt(args[0]);
        int radius = Integer.parseInt(args[1]);
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("volume cylinder is... " + volume);

    }
}
