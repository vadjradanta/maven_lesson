package SCHILDT_code_lessons_.Chapter_1_5;

public class Light {
    public static void main(String args[]) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // приблизительная скорость света, миль в секунду
        lightspeed = 186000;

        days = 1000; // указать количество дней

        seconds = days * 24 * 60 *60; //преобразователь в секунды

        distance = lightspeed * seconds; // вычислить расстояние

        System.out.print("За " + days);
        System.out.print(" дней свет проходит около ");
        System.out.println(distance + " миль");
    }
}
