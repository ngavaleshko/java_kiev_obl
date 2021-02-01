public class FourthExercise {

    public static void main(String[] args) {

        String a = args[0];
        String b = args[1];
        String c = args[2];

        Integer i = Integer.parseInt(a);
        Integer j = Integer.parseInt(b);
        Integer g = Integer.parseInt(c);

        if (i < j) {
            if (i < g) {
                System.out.println(i + " is the smallest number");
            } else if (g < i) {
                System.out.println(g + " is the smallest number");
            } else {
                System.out.println(g + " and " + i + " are the same smallest number");
            }
        }
        if (j < i) {
            if (j < g) {
                System.out.println(j + " is the smallest number");
            } else if (g < j) {
                System.out.println(g + " is the smallest number");
            } else {
                System.out.println(g + " and " + j + " are the same smallest number");
            }
        }
        if (j == i) {
            if (j < g) {
                System.out.println(j + " and " + i + " are the same smallest number");
            } else if (g < j) {
                System.out.println(g + " is the smallest number");
            } else {
                System.out.println("All 3 numbers are the same");
            }
        }
    }
}
