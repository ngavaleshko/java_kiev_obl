public class HW7Task4 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i > 0; i *= 2) {
            count++;
            if (count <= 20) {
                System.out.println(count + "-е число: " + i);
            } else {
                break;
            }

        }
    }
}
