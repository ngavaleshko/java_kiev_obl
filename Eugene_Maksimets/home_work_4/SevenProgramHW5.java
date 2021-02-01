
public class SevenProgramHW5 {

    public static void main(String[] args)
    {
        final double BOTTEL = 750;
        final double GLASS = 100;
        int countHuman = Integer.parseInt(args[0]);
        double needMl = countHuman * GLASS;
        double needBottel = Math.ceil(needMl / BOTTEL);
        double dontUseMl = (needBottel * BOTTEL) % (countHuman * GLASS);
        System.out.println("На " + countHuman + " человек необходимо " + needBottel + " бутылок." + " Остаток: " +
                dontUseMl + " мл");
        


    }

}