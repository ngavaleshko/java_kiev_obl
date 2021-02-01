public class HW7Task2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i > 0; i += 2) {
            count++;
            if (count <= 55) {
                System.out.println(count + "-е число: " + i);
            } else {
                break;
            }
        }
    }
}
