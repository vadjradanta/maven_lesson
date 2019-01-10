package SCHILDT_code_lessons_.Chapter_1_5;

// Применение оператора break цикле for в стиле for each

public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //использовать цикл for в стиле for each для
        //вывода и суммирования значений из части массива
        for (int x: nums) {
            System.out.println("значение равно " + x);
            sum +=x;
            if (x == 5) break; //прервать цикл после
                               //получения 5 значений
        }

        System.out.println("Сумма пяти первых элементов равна: " + sum);
    }
}
