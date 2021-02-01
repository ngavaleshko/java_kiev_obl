public class FourMinNumber {
    public static void main(String[] args) {
        int one = Integer.parseInt(args[0]); //11
        int two = Integer.parseInt(args[1]);// 13
        int three = Integer.parseInt(args[2]); //8

        if (one <= two && one <= three) {
            System.out.println("min numbers...is... " + one);
            if (one == two) {
                System.out.println("and numbers " + two + " too");
            }
        } else if (two <= one && two <= three) {
            System.out.println("min numbers...is... " + two);
            if (two == three) {
                System.out.println("and numbers " + three + " too");
            }
        } else if (three <= one && three <= two) {
            System.out.println("min numbers...is... " + three);

        }
    }
}
