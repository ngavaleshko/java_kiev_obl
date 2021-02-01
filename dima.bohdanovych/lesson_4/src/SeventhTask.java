public class SeventhTask {

    public static void main(String[] args) {

        String a = args[0];
        Integer b = Integer.parseInt(a);

        int c;
        int bottle = (b % 7.5 == 0) ? (c = (int) (b / 7.5)) : (c = (int) (b / 7.5)) + 1;

        System.out.println("Amount of people = " + b);
        System.out.println("Number of bottles of champagne = " + bottle);
        System.out.println("The rest of the champagne = " + ((bottle * 750) - (b * 100)));
    }
}
