public class HWTask7 {

    public static void main(String[] args) {
        int numOfDays = Integer.parseInt(args[0]);

        if (numOfDays > 7) {
            System.out.println("Rent pay is : " + (numOfDays * 40 - 50));
        } else if (numOfDays > 5) {
            System.out.println("Rent pay is : " + (numOfDays * 40 - 20));
        } else {
            System.out.println("Rent pay is : " + (numOfDays * 40));
        }
    }
}
