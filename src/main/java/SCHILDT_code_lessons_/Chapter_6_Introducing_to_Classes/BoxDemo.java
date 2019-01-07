package SCHILDT_code_lessons_.Chapter_6_Introducing_to_Classes;

/*программа использующая class Box

    Присвоить исходному файлу имя BoxDemo.java
 */

class Box {
    double width;
    double height;
    double deps;
}

//В этом классе объявляется объект типа Box
class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
                // присвоить значение переменным экземплярам mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.deps = 15;

        // рассчитать объём параллепипеда
        vol = mybox.width*mybox.height*mybox.deps;
        System.out.println("Объём равен " + vol);
    }
}
