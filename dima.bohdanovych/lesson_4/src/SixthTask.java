public class SixthTask {

    public static void main(String[] args) {

        String a = args[0];
        String b = args[1];

        Double i = Double.parseDouble(a);
        Double j = Double.parseDouble(b);

        System.out.println("Cylinder volume is " + (i * j * j * Math.PI));
    }
}
