package Let_JAVA_be_with_you;

import java.util.Random;

public class ArrayMethodsHW1 {


    /**
     * Определение чётных элементов
     *
     * @param array в массиве
     * @return количество чётных элементов
     */
    public static int numberOfEven(int array[]) {

        int countEven = 0;

        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2 == 0) && (array[i] != 0))
                countEven++;
        }
        return countEven;
    }

    /**
     * Определяем нечётные элементы
     *
     * @param array в массиве
     * @return количество нулей
     */
    public static int numberOfZero(int array[]) {

        int countOfZero = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                countOfZero++;
        }
        return countOfZero;
    }

    /**
     * Определяем чётные элементы
     *
     * @param array в массиве
     * @return количество чётных элементов
     */
    public static int numberOfOdd(int[] array) {
        int countOdd = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                countOdd++;
        }
        return countOdd;
    }

    /**
     * Определяем отрицательные элементы
     *
     * @param array в массиве
     * @return количество отрицательных элементов
     */
    public static int negativeNumbers(int[] array) {
        int countNegative = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0)
                countNegative++;
        }
        return countNegative;
    }


    /**
     * Поиск наибольшего целочисленного значения
     *
     * @param array массива
     * @return наибольшее целочисленное значение
     */
    public static int maxInArray(int[] array) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    /**
     * Поиск наименьшего целочисленного значения
     *
     * @param array массива
     * @return наименьшее значение
     */
    public static int minInArray(int[] array) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    /**
     * Поиск индекса искомого элемента
     *
     * @param array массива
     * @return индекс элемента
     */
    public static int[] indexElementInArray(int[] array, int element) {

        int[] index = new int[array.length];
        for (int i = 0; i < index.length; i++) {
            index[i] = -1;
        }
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index[counter++] = i;

                System.out.println("Искомое =" + i);
            }
        }
        return index;
    }


    /**
     * Поиск элементов с отображением в булевом массиве
     *
     * @param array заданный массив
     * @return массив с булевым утверждением true
     */
    public static boolean[] indexBoolElementArray(int[] array, int element) {
        boolean[] index2 = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {

            if (array[i] == element) {
                index2[i] = true;
            }
        }
        return index2;
    }

    /**
     * Сортировка массива по возрастанию пузырьковым методом (пятнашки)
     *
     * @param array массив целочисленных значений
     *              вывод через PrintArray пересортированного массива
     */
    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Вывод массива целочисленных значений на печать
     */

    public static void printArray(int[] array) {
        System.out.print("");
        for (int i = 0; i < array.length; i++) {
            System.out.println(" " + array[i] + ", ");
        }
    }

    /**
     * Генерация случайного набора чисел
     *
     * @param size  заданного размера
     * @param seed  с определённой генерацией
     * @param bound на заданном числовом отрезке
     * @return в массив
     */
    public static int[] randomSeedArrayEntry(int size, int bound, long seed) {

        Random random = new Random(seed);
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(bound);
        }
        return array;
    }

    /**
     * Генератор случайного набора чисел
     *
     * @param size  заданного размера
     * @param bound на заданном числовом отрезке
     * @return в массив
     */
    public static int[] randomArrayEntry(int size, int bound) {

        Random random = new Random();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(bound);
        }
        return array;
    }
    public static float stateMedianArray(int[] array){
         float median;

        if (array.length % 2 == 0) {

             int rightIndex  = (array.length / 2 - 1);
             int medianIndex = array.length / 2;
             median = (array[rightIndex] + array[medianIndex]) / 2;

        }
        else{
            int medianIndex = ((array.length - 1) / 2);
            median = array[medianIndex];
        }
         return median;
    }
}
