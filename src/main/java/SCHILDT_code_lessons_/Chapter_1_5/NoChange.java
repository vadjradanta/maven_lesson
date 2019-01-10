package SCHILDT_code_lessons_.Chapter_1_5;

//Переменная цикла в стиле for each доступна только для чтения

public class NoChange {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x: nums) {
            System.out.println(x + " ");
            x = x * 10; // Этот оператор не оказывает никакого
                        // влияния на массив nums
        }
        System.out.println();
            for (int x: nums);
        System.out.println();

    }
}
