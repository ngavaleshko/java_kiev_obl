public class TaskFive {
    public static void main(String[] args) {
        String teamA = args[0];
        String teamB = args[1];
        float a = Integer.parseInt(args[2]);
        float b = Integer.parseInt(args[3]);

        String winnerTeam = a > b ? teamA : teamB;
        float winnerResult = a > b ? ((a - b) / b) * 100 : ((b - a) / a) * 100;

        System.out.println("Team " + winnerTeam + " won by " + Math.round(winnerResult * 100) / 100F + "%");

    }
}
