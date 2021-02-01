public class Task_7 {
    public static void main(String[] args) {

        int allDays = Integer.valueOf(args[0]);
        System.out.println("days = " + allDays);
        rentSum(allDays);
    }

    private static void rentSum(int allDays) {
        int result;
        int day = 40;
        int discount1 = 20;
        int discount2 = 50;
        if ((allDays <= 5)&&(allDays>0)) {
            result = day * allDays;
            System.out.println("Sum of the rent is: " + result+" UHN, no discount");
        } else if ((allDays > 5)&&(allDays <= 7)) {
            result = (day * allDays)-discount1;
            System.out.println("Sum of the rent is: " + result+" UHN, with your discount: "+discount1+"UHN");
        }else if(allDays>7){
            result = (day * allDays)-discount2;
            System.out.println("Sum of the rent is: " + result+" UHN, with your discount: "+discount2+"UHN");
        }else if(allDays<=0){
            System.out.println("Value could not be 0 and less.");
        }
    }
}
