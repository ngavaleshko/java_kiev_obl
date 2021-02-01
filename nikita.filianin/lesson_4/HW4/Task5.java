public class Task5 {
    public static double getResult(double first, double second){
        double percent = 0;
        if (first > second){
            percent = ((first / second) * 100) - 100;
        }else if(second > first){
            percent = ((second / first) * 100) - 100;
        }
        return percent;
    }
    public static String whoWin(double first, double second){
        if (first > second){
            return "First team is winning";
        }
        else {
            return "Second team is winning";
        }
    }
    public static void main(String[] args) {
        System.out.println("name of first team: " + args[0]);
        String firstName = args[0];

        System.out.println("name of second team: " + args[1]);
        String secondName = args[1];

        System.out.println("score for first team: " + args[2]);
        double firstTeam = Integer.parseInt(args[2]);

        System.out.println("score for second team: " + args[3]);
        double secondTeam = Integer.parseInt(args[3]);

        System.out.println("Team: " + firstName + ". Score: " + firstTeam);
        System.out.println("Team: " + secondName + ". Score: " + secondTeam);
        System.out.println(whoWin(firstTeam, secondTeam));
        System.out.println("Winrate: " + getResult(firstTeam, secondTeam) + "%");
    }

public class Task5 {
    public static double getResult(double first, double second){
        double percent = 0;
        if (first > second){
            percent = ((first / second) * 100) - 100;
        }else if(second > first){
            percent = ((second / first) * 100) - 100;
        }
        return percent;
    }
    public static String whoWin(double first, double second){
        if (first > second){
            return "First team is winning";
        }
        else {
            return "Second team is winning";
        }
    }
    public static void main(String[] args) {
        System.out.println("name of first team: " + args[0]);
        String firstName = args[0];

        System.out.println("name of second team: " + args[1]);
        String secondName = args[1];

        System.out.println("score for first team: " + args[2]);
        double firstTeam = Integer.parseInt(args[2]);

        System.out.println("score for second team: " + args[3]);
        double secondTeam = Integer.parseInt(args[3]);

        System.out.println("Team: " + firstName + ". Score: " + firstTeam);
        System.out.println("Team: " + secondName + ". Score: " + secondTeam);
        System.out.println(whoWin(firstTeam, secondTeam));
        System.out.println("Winrate: " + getResult(firstTeam, secondTeam) + "%");
    }
}