import java.util.Random;
import java.util.Scanner;

public class Teams2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the first Team name:");
        String nameTeam1 = scanner.nextLine();

        System.out.println("Enter the second Team name:");
        String nameTeam2 = scanner.nextLine();


        Random random = new Random();
         double countTeam1 = (double) random.nextInt(100);
         double countTeam2 = (double) random.nextInt(100);

        System.out.println("first Team " + nameTeam1 + ", count: " + countTeam1);
        System.out.println("second Team " + nameTeam2 + ", count: " + countTeam2);

        double winTeam1 = (countTeam1/countTeam2)*100;
        double winTeam2 = (countTeam2/countTeam1)*100;

        System.out.println(countTeam1>countTeam2 ? "Wins team " + nameTeam1 + ". " +
                "Team Lead Percentage " + nameTeam1 + ": " +
                Math.round(winTeam1) + "%" : "Wins team " + nameTeam2 + ". " +
                "Team Lead Percentage " + nameTeam2 + ": " +
                Math.round(winTeam2) + "%");
    }
}
