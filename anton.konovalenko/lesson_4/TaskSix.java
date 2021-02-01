public class TaskSix {
    public static void main(String[] args) {
        float r = Integer.parseInt(args[0]);
        float h = Integer.parseInt(args[1]);

        System.out.println("The volume of cylinder is " + Math.round((Math.PI * Math.pow(r, 2) * h) * 100) / 100D + " cubic meters.");
    }
}
