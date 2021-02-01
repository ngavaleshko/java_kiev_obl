public class TaskFour { public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a < b || a < c) {
            if (a == b && a < c){
                System.out.println("The minimal numbers are " + a + " and " + b);
            } else if (a == c && a < b) {
                System.out.println("The minimal numbers are " + a + " and " + c);
            } else System.out.println("The minimal number is " + a);
        } else if (b < a || b < c) {
            if (b == a && b < c){
                System.out.println("The minimal numbers are " + b + " and " + a);
            } else if (b == c && b < a) {
                System.out.println("The minimal numbers are " + b + " and " + c);
            } else System.out.println("The minimal number is " + b);
        } else  if (c < a || c < b) {
            if (c == a && c < b){
                System.out.println("The minimal numbers are " + c + " and " + a);
            } else if (c == b && c < a) {
                System.out.println("The minimal numbers are " + c + " and " + b);
            } else System.out.println("The minimal number is " + c);
        }
    }
}
