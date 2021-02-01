
public class SixProgramHW5 {

    public static void main(String[] args)
    {
        float radius = Integer.parseInt(args[0]);
        float high = Integer.parseInt(args[1]);
        double result = Math.PI * Math.pow(radius, 2) * high;
        System.out.println("Объем цилиндра = " + result);


    }

}