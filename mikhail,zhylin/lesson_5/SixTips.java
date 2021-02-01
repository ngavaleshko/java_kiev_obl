public class SixTips {
    public static void main(String[] args) {
        int sum = Integer.parseInt(args[0]);
        String servis = args[1];
        int tips;
        if (servis.equals("terrible")) {
            System.out.println("terrible...is not tips");
        } else if (servis.equals("poor")) {
            tips = (sum / 100) * 5;
            System.out.println("Poor tips is.." + tips);
        } else if (servis.equals("good")) {
            tips = (sum / 100) * 10;
            System.out.println("Good tips is.." + tips);
        } else if (servis.equals("great")) {
            tips = (sum / 100) * 15;
            System.out.println("great tips is.." + tips);
        } else if (servis.equals("excellent")) {
            tips = (sum / 100) * 20;
            System.out.println("excellent is..." + tips);
        }
    }
}
