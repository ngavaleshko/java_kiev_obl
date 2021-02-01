import java.util.Objects;

public class FifthExercise {

    public static void main(String[] args) {

        String a = args[0];
        String c = args[1];
        String b = args[2];

        Integer i = Integer.parseInt(a);
        Integer j = Integer.parseInt(b);

        if (c.equals("+")) {
            System.out.println(i + " + " + j + " = " + (i + j));
        }
        if (c.equals("/")) {
            System.out.println(i + " / " + j + " = " + (i / j));
        }
        if (c.equals("x")) {
            System.out.println(i + " * " + j + " = " + (i * j));
        }
        if (c.equals("-")) {
            System.out.println(i + " - " + j + " = " + (i - j));
        }
        if (c.equals("%")) {
            System.out.println(i + " % " + j + " = " + (i % j));
        }
        if (c.equals("abs")) {
            System.out.println("|" + i + "| = " + Math.abs(i));
        }
    }
}
