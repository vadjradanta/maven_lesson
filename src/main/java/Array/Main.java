package Array;

public class Main {

    public static void main(String[] args) {

        int[] baseArray = {10, -20, 0, 30, 40, 60, 10};
        boolean[] booArray = new boolean[baseArray.length];

        for (int i = 0; i < baseArray.length; i++) {

            if (baseArray[i] == 10) {
                booArray[i] = true;

                System.out.println(i);
            }

        }

    }
}