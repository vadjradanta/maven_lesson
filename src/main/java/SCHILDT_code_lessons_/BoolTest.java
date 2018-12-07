package SCHILDT_code_lessons_;

public class BoolTest {
    public static void main(String args[]) {
        boolean b;
        b = false;

        System.out.println("b равно " + b);

        b = true;
        System.out.println("b равно " + b);

        //Значение типа boolean может управлять оператором if
        if (b) System.out.println("Этот код выплоняется");
        b = false;
        if (b) System.out.println("Этот код не выплоняется");

        //результат сравнения - значение типа boolean
        System.out.println("10 > 9 равно " + (10 > 9));
    }

}
