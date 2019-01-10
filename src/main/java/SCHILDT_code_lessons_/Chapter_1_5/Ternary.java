package SCHILDT_code_lessons_.Chapter_1_5;

//Продемонстрировать тернарную операцию "?"
public class Ternary {
    public static void main(String args[]) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i; // получить абсолютное значение i
        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);

        i = -10;
        k = i < 0 ? -i : i; //получить абсолютное значение i
        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);
    }
}
