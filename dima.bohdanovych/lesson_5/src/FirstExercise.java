public class FirstExercise {

    public static void main(String[] args) {

        String a = args[0];

        Integer i = Integer.parseInt(a);

        if (i % 2 == 0) {
            System.out.println(i + " is an even number");
        } else {
            System.out.println(i + " is an odd number");
        }
    }
}
