package hm_4;

public class Task6_Cillinder {
    public static void main(String[] args) {
        int h = Integer.valueOf(args[0]);
        int r = Integer.valueOf(args[1]);
        System.out.println("Enter high (h): "+h);
        System.out.println("Enter radius (r):"+r);
        double V = Math.PI * Math.pow(r, 2) * h;
        System.out.println((h <= 0) || (r <= 0) ? "The value is less then 0" :
                "V = " + V);
    }
}
