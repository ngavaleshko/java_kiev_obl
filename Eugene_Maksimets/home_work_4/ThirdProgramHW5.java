

public class ThirdProgramHW5 {
    public static void main(String[] args) {

        int firstNum = Integer.parseInt(args[0]);
        int secondNum = Integer.parseInt(args[1]);
        int thirdNum = Integer.parseInt(args[2]);
        String result = Integer.toString((int) Math.pow(firstNum, secondNum), thirdNum);
        System.out.println(result);
        
    }
}
