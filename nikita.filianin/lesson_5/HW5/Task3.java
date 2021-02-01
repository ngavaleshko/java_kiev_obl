public class Task3 {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int result1 = Math.abs(10-a);
        int result2 = Math.abs(10-b);

        if (result1>result2){
            System.out.println("Ближайшее к значению 10: " + b);
        }
        if (result1<result2){
            System.out.println("Ближайшее к значению 10: " + a);
        }
        if (result1==result2){
            System.out.println(a + " и " + b + " одинаково близки к значению 10");
        }
    }
}

