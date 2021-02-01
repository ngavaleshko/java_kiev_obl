class Task2 {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int maxNum = num1 < num2 ? num2 : num1;
        maxNum = maxNum < num3 ? num3 : maxNum;
        System.out.println("Max number is : " + maxNum);
        
    }
}