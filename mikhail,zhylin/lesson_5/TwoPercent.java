public class TwoPercent {
    public static void main(String[] args) {
        int oneNumb = Integer.parseInt(args[0]);
        int twoNumb = Integer.parseInt(args[1]);
        int percent = oneNumb % twoNumb;
        if (percent == 0) {

            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
