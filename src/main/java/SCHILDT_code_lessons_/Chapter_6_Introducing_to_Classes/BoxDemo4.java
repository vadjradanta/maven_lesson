package SCHILDT_code_lessons_.Chapter_6_Introducing_to_Classes;

//Теперь метод volume() возвращает объём параллепипеда

class Box4 {
    double width;
    double height;
    double depth;

    double volume() {
        return width*height*depth;
    }
}

class BoxDemo4 {
    public static void main(String[] args) {
        Box4 mybox1 = new Box4();
        Box4 mybox2 = new Box4();
        double vol;

        //присвоить значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 15;
        mybox1.depth = 20;

        /*присвоить другие значения переменным экземпляра mybox2 */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // получить объём первого параллепипеда
        vol = mybox1.volume();
        System.out.println("Объём равен " + vol);

        // получить объём второго параллепипеда
        vol = mybox2.volume();
        System.out.println("Объём равен " + vol);
    }
}
