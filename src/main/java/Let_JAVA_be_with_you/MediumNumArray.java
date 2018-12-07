package Let_JAVA_be_with_you;

public class MediumNumArray {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 2, 1, 4, 5, 1, 3};
        float summ;

        System.out.printf("Среднее значение массива = " + medSumm(arr));
    }

    public static double medSumm(int[] arr) {

        float summ = arr[0];
        for (int i = 1; i < arr.length; i++) {
            summ += arr[i];
        }
        return divide(summ, arr.length);
    }
    public static double divide(double summ, int length) {
        return summ/length;
    }
}

