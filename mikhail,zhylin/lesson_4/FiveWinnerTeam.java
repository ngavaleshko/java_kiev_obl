public class FiveWinnerTeam {
    public static void main(String[] args) {
        String teamOne = args[0];
        String teamTwo = args[1];
        double scoreOne = Double.parseDouble(args[2]);
        double scoreTwo = Double.parseDouble(args[3]);
        double procWinner;
        if (scoreOne > scoreTwo) {
            procWinner = scoreOne / scoreTwo * 100.0D - 100.0D;
            System.out.println("Winner is " + teamOne + " " + Math.round(procWinner) + " %");
        } else if (scoreTwo > scoreOne) {
            procWinner = scoreTwo / scoreOne * 100.0D - 100.0D;
            System.out.println("Winner is " + teamTwo + " " + Math.round(procWinner) + " %");
        }

    }
}
