public class Task4 {
    public static void main(String[] args) {

        int catet1 = Integer.parseInt(args[0]);
        int catet2 = Integer.parseInt(args[1]);
        int hypotenuse = 0;
        hypotenuse = (int) Math.sqrt(catet1 * catet1 + catet2 * catet2);
        System.out.println("Hypotenuse = : " + hypotenuse);

    }
}
