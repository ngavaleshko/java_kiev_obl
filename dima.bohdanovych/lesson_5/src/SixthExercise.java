public class SixthExercise {

    public static void main(String[] args) {

        String a = args[0];
        String b = args[1];

        Integer i = Integer.parseInt(a);

        if (b.equals("terrible")) {
            System.out.println("You should not leave any tip");
        }
        if (b.equals("poor")) {
            System.out.println("You should leave " + i * 0.05 + " a tip");
        }
        if (b.equals("good")) {
            System.out.println("You should leave " + i * 0.1 + " a tip");
        }
        if (b.equals("great")) {
            System.out.println("You should leave " + i * 0.15 + " a tip");
        }
        if (b.equals("excellent")) {
            System.out.println("You should leave " + i * 0.2 + " a tip");
        }

    }
}
