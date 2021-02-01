public class SevenChampagne {
    public static void main(String[] args) {
        int people = Integer.parseInt(args[0]);

        final double CHAMPAGNE = 750;
        final double GLASS = 100;

        double needGlass = people * GLASS;
        double needChamp = Math.ceil(needGlass / CHAMPAGNE);
        double remain = (needChamp * CHAMPAGNE) % (people * GLASS);

        System.out.println("For people " + people + " need bottles " + needChamp + " Residue... " +
                remain + " ml ");
    }
}
