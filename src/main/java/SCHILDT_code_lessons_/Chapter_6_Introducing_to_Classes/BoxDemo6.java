package SCHILDT_code_lessons_.Chapter_6_Introducing_to_Classes;

//в данном примере программы для инициализации размеров
// параллепипеда в классе Box применяется конструктор

class Box6{
    double width;
    double height;
    double depth;

    //Это конструкто класса Box
    Box6() {
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    //рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo6 {
    public static void main(String[] args) {
        //объявить, выделить память и инициализировать объекты типа Box6
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();

        double vol;

        //получить объём первого параллепипеда
        vol = mybox1.volume();
        System.out.println("Объём равен " + vol);

        //получить объём второго параллепипеда
        vol = mybox2.volume();
        System.out.println("Объём равен " + vol);
    }
}
