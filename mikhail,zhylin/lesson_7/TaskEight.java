public class TaskEight {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100000; i < 999999; i++) {
            int oneNumb = i / 100000;
            int twoNumb = (i / 10000) % 10;
            int threeNumb = (i / 1000) % 10;
            int fourNumb = (i / 100) % 10;
            int fiveNumb = (i / 10) % 10;
            int sixNumb = i / 10 % 10;
            if (oneNumb + twoNumb + threeNumb == fourNumb + fiveNumb + sixNumb) {
                count++;
            }
        }
        System.out.println("sum of lucky ticket is ..." + count);
    }
}
