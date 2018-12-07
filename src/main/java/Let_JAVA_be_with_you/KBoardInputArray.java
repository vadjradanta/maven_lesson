package Let_JAVA_be_with_you;

import java.util.Scanner;

import static Let_JAVA_be_with_you.ArrayMethodsHW1.*;

public class KBoardInputArray {
    public static void main(String[] args) {
        int[] array;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество элементов: ");
        int count = scanner.nextInt();

        System.out.print("Введите элеметны:");

        array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Значение" + i + " =");
            array[i] = scanner.nextInt();


        }
        System.out.println("Кол-во чётных элементов   = " + numberOfEven(array));
        System.out.println("Кол-во нечётных элементов = " + numberOfOdd(array));
        System.out.println("Кол-во нулей              = " + numberOfZero(array));
    }
}

