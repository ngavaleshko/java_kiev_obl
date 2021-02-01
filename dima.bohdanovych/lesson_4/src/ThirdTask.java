public class ThirdTask {

    public static void main(String[] args) {

        String a = args[0];
        String b = args[1];
        String c = args[2];

        Integer i = Integer.parseInt(a);
        Integer j = Integer.parseInt(b);
        Integer g = Integer.parseInt(c);

        System.out.println("Result is " + Integer.toString((int) Math.pow(i, j), g)  );

    }
}
