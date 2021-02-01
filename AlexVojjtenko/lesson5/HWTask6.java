public class HWTask6 {

    public static void main(String[] args) {
        float check = Integer.parseInt(args[0]);
        String text = args[1];

        if (text.equals("terrible")) {
            System.out.println("Sum of tips is " + (check * 0));
        } else if (text.equals("poor")) {
            System.out.println("Sum of tips is " + (check * 0.05));
        } else if (text.equals("good")) {
            System.out.println("Sum of tips is " + (check * 0.1));
        } else if (text.equals("great")) {
            System.out.println("Sum of tips is " + (check * 0.15));
        } else if (text.equals("excellent")) {
            System.out.println("Sum of tips is " + (check * 0.2));
        }
    }
}
