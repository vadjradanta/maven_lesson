package SCHILDT_code_lessons_;

//Целевая часть цикла может быть пустой

public class NoBody {
    public static void main(String[] args) {
        int i, j;

        i = 100;
        j = 200;
                           //рассчитать среднее значение переменных i и j
        while(++i < --j); //у этого цикла отсутствует тело
        System.out.println("Среднее значение равно " + i);
    }
}
