package SCHILDT_code_lessons_.Chapter_6_Introducing_to_Classes;

//В этой программе объявляются два объекта класса Box

class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // присвоить значения переменных экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        /*
        присвоить другие значения переменным
        экземпляра mybox2
         */

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //рассчитать объём первого параллепипеда
        vol = mybox1.width*mybox1.height*mybox1.depth;
        System.out.println("Объём равен " + vol);

        //рассчитать объём второго параллепипеда
        vol = mybox2.width*mybox2.height*mybox2.depth;
        System.out.println("Объём равен " + vol);

    }


}
