package SCHILDT_code_lessons_.Chapter_1_5;

//несколько операторов в инициализирующих и итерационных частях, пример использования запятой

public class Sample {
    public static void main (String[] args) {
        int a, b;

        b = 4;

        for (a = 1; a < b; a++) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            b--;
        }
    }
}
