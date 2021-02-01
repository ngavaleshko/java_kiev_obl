public class FourthTask {

    public static void main(String[] args) {

        String a = args[0];
        String b = args[1];

        Double i = Double.parseDouble(a);
        Double j = Double.parseDouble(b);

        double sum = (i * i) + (j * j);
        System.out.println("The length of the hypotenuse is " + Math.sqrt(sum));
    }
}
