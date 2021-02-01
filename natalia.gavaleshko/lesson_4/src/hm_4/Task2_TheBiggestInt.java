package hm_4;


public class Task2_TheBiggestInt {
    public static void main(String[] args) {
        int var1 = Integer.valueOf(args[0]);
        int var2 = Integer.valueOf(args[1]);
        int var3 = Integer.valueOf(args[2]);
        String values = ("var1 = "+ var1 +" var2 = "+var2+" var3 = "+var3);
        System.out.println((var1 > var2) && (var1 > var3) ? values+" Var1 is greater: "+var1 :
                (var2 > var3) && (var2 > var1) ? values+" Var2 is greater: "+var2 :
                        (var3 > var1) && (var3 > var2) ? values+" Var3 is greater: "+var3 :
                                "Numbers are equal: "+var1+" "+var2+" "+var3);
    }
}