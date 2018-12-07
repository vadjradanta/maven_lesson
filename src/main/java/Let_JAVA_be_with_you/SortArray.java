package Let_JAVA_be_with_you;

import static Let_JAVA_be_with_you.ArrayMethodsHW1.*;

public class SortArray {
    public static void main(String[] args) {
        int array[] = new int[]{18, 0, 7, 15, 10, 6, 1, -22};

        System.out.println("Число   чётных элементов = " + numberOfEven(array));
        System.out.println("Число нечётных элементов = " + numberOfOdd(array));
        System.out.println("Количество нулей         = " + numberOfZero(array));
        System.out.println("Отрицательных чисел      = " + negativeNumbers(array));



        bubbleSort(array);
        printArray(array);


    }

}
