public class ThirdExercise {

    public static void main(String[] args) {

        String a = args[0];
        String b = args[1];

        Integer i = Integer.parseInt(a);
        Integer j = Integer.parseInt(b);

        int h;
        int g;

        if (i < 0) {
            h = i + 10;
        } else if (i > 10) {
            h = i - 10;
        } else {
            h = 10 - i;
        }
        if (j < 0) {
            g = j + 10;
        } else if (j > 10) {
            g = j - 10;
        } else {
            g = 10 - j;
        }
        if (g < h) {
            System.out.println(j + " is closer to 10");
        } else if (g > h) {
            System.out.println(i + " is closer to 10");
        } else {
            System.out.println("The number are the same");
        }
    }
}

