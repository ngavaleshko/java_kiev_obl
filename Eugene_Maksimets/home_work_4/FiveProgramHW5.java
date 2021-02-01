
public class FiveProgramHW5 {

    public static void main(String[] args) {
        String teamOne = args[0];
        String teamTwo = args[1];
        float scoreTeamOne = Integer.parseInt(args[2]);
        float scoreTeamTwo = Integer.parseInt(args[3]);
        final int HIGH_PROC = 100;
        double finalProc;
        if (scoreTeamOne > scoreTeamTwo) {
            finalProc = ((scoreTeamOne - scoreTeamTwo) / scoreTeamTwo) * HIGH_PROC;
            System.out.println(teamOne + " опережает " + teamTwo + " на " + finalProc + "%");

        } else if (scoreTeamTwo > scoreTeamOne) {
            finalProc = ((scoreTeamTwo - scoreTeamOne) / scoreTeamOne) * HIGH_PROC;
            System.out.println(teamTwo + " опережает " + teamOne + " на " + finalProc + "%");

        } else {
            System.out.println("Счет между командами равен");
        }

        
    }
}