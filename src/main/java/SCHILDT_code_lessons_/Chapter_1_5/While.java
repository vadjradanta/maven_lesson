package SCHILDT_code_lessons_.Chapter_1_5;

//продемонстрировать применение оператора цикла while

public class While {
    public static void main(String[] args) {
        int n = 10;

        while (n > 0) {
            System.out.println("такт " + n);
            n--;
        }
    }
}
