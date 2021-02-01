public class TheeNearestNumber {
    public static void main(String[] args) {
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);

        final int TEN = 10;

        int resOne = Math.abs(TEN - first);
        int resTwo = Math.abs(TEN - second);
        if (resOne == resTwo) {
            System.out.println("numbers... " + first + " and " + second + " equidistant to " + TEN);
        } else if (resOne > resTwo) {
            System.out.println("number " + second + " near " + TEN);
        } else if (resOne < resTwo) {
            System.out.println("number  " + first + " near " + TEN);
        }
    }
}
