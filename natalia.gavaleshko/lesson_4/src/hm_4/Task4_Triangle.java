package hm_4;

public class Task4_Triangle {
    public static void main(String[] args) {
        int var1 = Integer.valueOf(args[0]);
        int var2 = Integer.valueOf(args[1]);
        double var3 = Math.sqrt(Math.pow(var1, 2) + Math.pow(var2, 2));
        System.out.println(var3);
    }
}
