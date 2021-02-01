package hm_4;

public class Task3_ThreeNumbers {
    public static void main(String[] args) {
        int var1 = Integer.valueOf(args[0]);
        int var2 = Integer.valueOf(args[1]);
        int var3 = Integer.valueOf(args[2]);

        int result =(int) Math.pow(var1, var2);
        String convert = (var3 ==2)? Integer.toBinaryString(result):
                (var3==8)?  Integer.toOctalString(result):
                                (var3==16)?  Integer.toHexString(result):
                                        "Incorrect system. Please enter 2, 8 or 16";
        System.out.println("First number is: "+var1+" Second number is: "+ var2+" Result of their Pow is: "+result+ " Result in numeral is: "+convert );
    }
}
