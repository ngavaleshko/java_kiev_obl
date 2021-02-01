public class Task1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        System.out.println((a % 2 == 0) ? "Число " + a + " чётное!" : "Число " + a + " не чётное!");
    }
}
