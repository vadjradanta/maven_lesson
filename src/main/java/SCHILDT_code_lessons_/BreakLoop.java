package SCHILDT_code_lessons_;

//Применение оператора break для выхода из цикла

public class BreakLoop {
    public static void main (String[] args) {
        for(int i = 0; i < 100; i++){
            if (i == 10) break; // выход из цикла если значение
                                //i равно 10
            System.out.println("i " + i);
        }
        System.out.println("Цикл завершён.");
    }
}
