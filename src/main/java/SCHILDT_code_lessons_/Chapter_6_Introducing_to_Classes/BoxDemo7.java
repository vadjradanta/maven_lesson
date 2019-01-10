package SCHILDT_code_lessons_.Chapter_6_Introducing_to_Classes;

/*
В данном примере программы для инициализации размеров
параллепипеда в классе Box применяется параметризированный
конструктор
 */

class Box7 {
    double width;
    double height;
    double depth;

    // Это конструктор класса Box7
    Box7 (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //Рассчитать и возвратить объём
    double volume(){
        return width * height * depth;
    }
}

class BoxDemo7 {
    public static void main(String[] args) {
        //объявить, выделить память, и инициализировать объекты Box7
        Box7 mybox1 = new Box7(10, 20, 15);
        Box7 mybox2 = new Box7(3,6,9);

        double vol;

        //получить объём первого параллепипеда
        vol = mybox1.volume();
        System.out.println("Объём равен " + vol);

        //получить объём второго параллепипеда
        vol = mybox2.volume();
        System.out.println("Объём равен " + vol);



    }
}
