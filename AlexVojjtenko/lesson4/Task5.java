public class Task5 {

    public static void main(String[] args) {
        int firstTeamScore = Integer.parseInt(args[0]);
        String firstTeamName = args[1];
        int secondTeamScore = Integer.parseInt(args[2]);
        String secondTeamName = args[3];

        System.out.println("Match score is:\n" + firstTeamName + " " + firstTeamScore + " : " +
                secondTeamScore + " " + secondTeamName + "\nThe " + firstTeamName + " better than " + secondTeamName +
                " on " + ((firstTeamScore / secondTeamScore) * 100 - 100) + "%.");
    }
}
