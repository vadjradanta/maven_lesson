package SCHILDT_code_lessons_.Chapter_1_5;

// Рациональная организация цикла for с использованием запятых

public class Comma {
    public static void main(String[] args) {
        int a, b;

        for (a = 1, b = 4; a < b; a++, b--){
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
