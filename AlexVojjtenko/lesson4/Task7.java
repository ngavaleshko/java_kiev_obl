public class Task7 {

    public static void main(String[] args) {
        int personAmount = Integer.parseInt(args[0]);
        int champagneAmount =personAmount*100;
        int bottlesAmount = champagneAmount/750==0 ? champagneAmount/750 : (champagneAmount/750)+1;
        System.out.println("For the "+ personAmount+" persons nedded "+ bottlesAmount+" bottles.\n" +
                "The rest of the champagne is : "+ (champagneAmount%750)+ " ml");


    }
}
