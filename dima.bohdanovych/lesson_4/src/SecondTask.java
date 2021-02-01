public class SecondTask {

    public static void main(String[] args) {

        String a = args[0];
        String b = args[1];
        String c = args[2];

        Integer i = Integer.parseInt(a);
        Integer j = Integer.parseInt(b);
        Integer g = Integer.parseInt(c);

        int max = 0;
        int maxNumber = (i > j) ? (max = i)
                : (j > g) ? (max = j)
                :           (max = g);

        System.out.println("The biggest number is " + maxNumber);

    }
}
