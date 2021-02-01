public class TwoMaxValue {
    public static void main(String[] var0) {
        int var1 = Integer.parseInt(var0[0]);
        int var2 = Integer.parseInt(var0[1]);
        int var3 = Integer.parseInt(var0[2]);
        if (var1 > var2 && var1 > var3) {
            System.out.println("Max Value is ..." + var1);
        } else if (var2 > var1 && var2 > var3) {
            System.out.println("Max Value is ..." + var2);
        } else if (var3 > var1 && var3 > var2) {
            System.out.println("Max Value is ..." + var3);
        }

    }

}
