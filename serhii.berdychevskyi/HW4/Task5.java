public class Task5 {
    public static void main(String[] args) {

        int team1 = Integer.parseInt(args[0]);
        String teamName1 = args[1];
        int team2 = Integer.parseInt(args[2]);
        String teamName2 = args[3];

        System.out.println("Score is:" + teamName1 + " " + team1 + " : " +
                team2 + " " + teamName2 + " " + teamName1 + "   " + teamName2 +
                " " + ((team1 / team2) * 100 - 100) + "%.");
    }
    }
