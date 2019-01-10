package SCHILDT_code_lessons_.Chapter_6_Introducing_to_Classes;

//в этой программе применяется метод с параметрами

class Box5 {
    double width;
    double heigth;
    double depth;

    //рассчитать и возвратить объём
    double volume() {
        return  width * heigth * depth;
    }

    // установить размеры параллепипеда
    void setDim(double w, double h, double d) {
        width = w;
        heigth = h;
        depth = d;
    }
}

class BoxDemo5 {
    public static void main(String[] args) {

        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();
        double vol;

        //инициализировать каждый экземпляр класса Box
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        //получить объём первого параллепипеда
        vol = mybox1.volume();
        System.out.println("Объём равен " + vol);

        //получить объём второго параллепипеда
        vol = mybox2.volume();
        System.out.println("Объём равен " + vol);

    }

}
