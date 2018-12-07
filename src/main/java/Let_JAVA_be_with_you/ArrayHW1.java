package Let_JAVA_be_with_you;

import java.util.Scanner;
import static Let_JAVA_be_with_you.ArrayMethodsHW1.*;

public class ArrayHW1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in); //ввод с клавиатуры через консоль

        System.out.print("Введите целочисленное количество элементов: ");
        int size = scanner.nextInt(); // задаём требуемый размер массива (по ДЗ: 100; 500; 1.000)

        System.out.print("Введите целочисленный диапазон генерации случайного массива: ");
        int bound = scanner.nextInt(); // задаём величину числового отрезка (по ДЗ 100)

        int[] array = randomArrayEntry(size, bound); // randomArray получает размер
                                                     // и числовой отрезок генерации
                                                     // генерирует и возвращает массив

        System.out.println("Количество нулей            = " + numberOfZero(array));
        System.out.println("Кол-во   чётных элементов   = " + numberOfEven(array));
        System.out.println("Кол-во нечётных элементов   = " + numberOfOdd(array));
        System.out.println("Кол-во отрицательных чисел  = " + negativeNumbers(array));

        bubbleSort(array);
        printArray(array);

        System.out.println("Медиана массива             = " + stateMedianArray(array));

    }
}
