package SCHILDT_code_lessons_.Chapter_6_Introducing_to_Classes;


//В этой программе применяется метод, введённый в класс Box

class Box1 {
    double width;
    double height;
    double depth;

    //вывести объём параллепипеда
    void volume() {
        System.out.print("Объём равен ");
        System.out.println(width*height*depth);
    }
}

class BoxDemo3 {
    public static void main(String[] args) {
        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();

        //присвоить значение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //присвоить значение переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //вывести объём первого параллепипеда
        mybox1.volume();

        //вывести объём второго параллепипеда
        mybox2.volume();
    }
}
