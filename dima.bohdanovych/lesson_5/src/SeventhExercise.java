public class SeventhExercise {

    public static void main(String[] args) {

        String a = args[0];

        Integer i = Integer.parseInt(a);

        if (i <= 0) {
            System.out.println("Nothing to pay");
        }
        if (i > 0 && i <= 5) {
            System.out.println("You have to pay " + i * 40);
        }
        if (i > 5 && i <= 7) {
            System.out.println("You have to pay " + (i * 40 - 20));
        }
        if (i > 7) {
            System.out.println("You have to pay " + (i * 40 - 50));
        }
    }
}
