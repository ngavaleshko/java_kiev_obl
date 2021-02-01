public class TaskFour {
    public static void main(String[] args) {
        float a = Integer.parseInt(args[0]);
        float b = Integer.parseInt(args[1]);
        System.out.println("The length of the hypotenuse is " + Math.round(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) * 100) / 100D + "сm");
    }
}
