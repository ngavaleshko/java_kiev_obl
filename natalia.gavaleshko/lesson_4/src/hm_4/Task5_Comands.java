package hm_4;

public class Task5_Comands {
    public static void main(String[] args) {
        int var1 = Integer.valueOf(args[0]);
        System.out.println("result1 is: " + var1);
        String com1 = String.valueOf(args[1]);
        System.out.println("Name of team1 is: " + com1);
        int var2 = Integer.valueOf(args[2]);
        System.out.println("result2 is: " + var2);
        String com2 = String.valueOf(args[3]);
        System.out.println("Name of team1 is: " + com2);
        double koef1 = var1 / var2;
        double koef2 = var2 / var1;
        System.out.println((var1 > var2) ? "The winner between: " + com1 + " and " + com2 + " is " + com1 + " with koeficient of greatness: " + koef1 :
                (var1 < var2) ? "The winner between: " + com1 + " and " + com2 + " is " + com2 + " with koeficient of greatness: " + koef2 :
                        (var1 <= 0) ? "The looser is" + var1 :
                                (var2 <= 0) ? "Tje looser is" + 2 :
                                        (var1 <= 0) && (var2 <= 0) ? "Both are loosers" :
                                                "Results are equal");

    }
}
