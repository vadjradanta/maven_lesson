package SCHILDT_code_lessons_.Chapter_1_5;

// Эта программа содержит ошибку

public class BreakErr {
    public static void main(String[] args) {
        one:for (int i = 0; i < 3; i++) {
            System.out.print("Проход " + i + ": ");
                // в учебнике в этой строке поставлена } для демонстрации
                // ошибки исполнения оператора прерывания break
            for (int j = 0; j < 100; j++) {
                if (j == 10) break one; //Ошибка!
                System.out.println(j + " ");
            }
        }
    }
}
