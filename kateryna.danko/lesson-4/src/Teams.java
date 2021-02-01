public class Teams {
    public static void main(String[] args) {
        System.out.println("You enter the first Team name: "+ args[0]);
        System.out.println("You enter the first Team count: "+ args[1]);
        double countTeam1 = Double.parseDouble(args[1]);
        System.out.println("You enter the second Team name: "+ args[2]);
        System.out.println("You enter the second Team count: "+ args[3]);
        double countTeam2 = Double.parseDouble(args[3]);

        double winTeam1 = (countTeam1/countTeam2)*100;
        double winTeam2 = (countTeam2/countTeam1)*100;

        System.out.println(countTeam1>countTeam2 ? "Wins team " + args[0] + ". " +
                "Team Lead Percentage " + args[0] + ": " +
                        Math.round(winTeam1) + "%" : "Wins team " + args[2] + ". " +
                "Team Lead Percentage " + args[2] + ": " +
                        Math.round(winTeam2) + "%");

    }
}
