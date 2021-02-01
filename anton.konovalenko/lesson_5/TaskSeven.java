public class TaskSeven {
    public static void main(String[] args) {
        int daysCount = Integer.parseInt(args[0]);
        int pricePerDay = 40;
        int discount;

        if (daysCount >= 5 && daysCount < 7){
            discount = 20;
            System.out.println("If you will live here for a " + daysCount + " days, you will need to pay " + ((daysCount * pricePerDay)-discount));
        } else if (daysCount >= 7){
            discount = 50;
            System.out.println("If you will live here for a " + daysCount + " days, you will need to pay " + ((daysCount * pricePerDay)-discount));
        }
    }
}
