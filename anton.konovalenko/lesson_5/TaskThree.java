import static java.lang.Math.abs;

public class TaskThree {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (abs(a - 10) < abs(b -10)) {
            System.out.println(a + " is closer to 10");
        } else if (abs(a - 10) == abs(b -10)) {
            System.out.println("Both numbers are equally close to 10");
        } else {
            System.out.println(b + " is closer to 10");
        }



    }
}
