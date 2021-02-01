public class FifthTask {

    public static void main(String[] args) {

        String a = args[0];
        String b = args[1];
        String c = args[2];
        String d = args[3];

        Double i = Double.parseDouble(a);
        Double j = Double.parseDouble(b);


        double e = (i / j * 100) - 100;
        double f = (j / i * 100) - 100;
        String winner = (i > j) ? "Team " + c + " is a " +  e + "% ahead Team " + d
            : (j > i) ? "Team " + d + " is a " + f + "% ahead Team " + c
            : "0";

        System.out.println(winner);
    }
}
