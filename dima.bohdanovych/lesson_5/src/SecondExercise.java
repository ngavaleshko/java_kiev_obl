public class SecondExercise {

    public static void main(String[] args) {

        String a = args[0];
        String b = args[1];

        Integer i = Integer.parseInt(a);
        Integer j = Integer.parseInt(b);

        if (i % j == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
