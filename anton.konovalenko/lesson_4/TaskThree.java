public class TaskThree {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        String res = (c == 2) ? Integer.toBinaryString((int) Math.pow(a, b))
                : (c == 8) ? Integer.toOctalString((int) Math.pow(a, b))
                : (c == 10) ? String.valueOf((int) Math.pow(a, b))
                : (c == 16) ? Integer.toHexString((int) Math.pow(a, b))
                : "You put incorrect number system (third value). Please, type only '2, 8, 10, 16'!";

        System.out.println(res);
    }
}
