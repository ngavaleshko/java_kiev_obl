public class TaskTwo {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int max = (a > b) ? a : Math.max(b, c);

        System.out.println("Biggest number is: " + max);

    }
}
