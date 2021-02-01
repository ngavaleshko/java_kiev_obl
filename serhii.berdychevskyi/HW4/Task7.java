public class Task7 {
    public static void main(String[] args) {

        int people = Integer.parseInt(args[0]);
        
        final double CHAMPAGNE = 750;
        final int GLASS = 100;
        int needGlass = (people * GLASS);
        int needBottles = (int) Math.ceil(needGlass/CHAMPAGNE);
        int remnant = (int) ((needBottles * CHAMPAGNE) % (people * GLASS));
        System.out.println("For " + people + " people " + "needed " + needBottles + " bottles. " + " Remnant " + remnant + " ml.");

    }
}
