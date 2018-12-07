package org.anatacreative.maven_lesson;

public class Main {
    public static void main(String[] args) {
        double radius = 10;
        System.out.println(calculatePerimeter(radius));
        System.out.println(calculateSquare(radius));

//        switch (var > 0) {
//            case true:  {
//              double calculateArea = PI * var * var;
//               double calculatePerimeter = PI * var * var;
//               System.out.println("Площадь круга = " + calculateArea);
//               System.out.println("Длина окружности = " + calculatePerimeter);
//               break;
//               }
//           default: {
//               System.out.println("0");
//               System.out.println("Введено некорректное значение радиуса");
//               }
//           }

//
//            if (var > 0) {
//                double calculateArea = PI * var * var;
//                double calculatePerimeter = PI * 2 * var;
//
//                System.out.println("Площадь круга = " + calculateArea);
//                System.out.println("Длина окружности = " + calculatePerimeter);
//               }
//            else if (var <= 0) {
//                System.out.println("0");
//                System.out.println("Вы ввели некорректное значение радиуса");
//            }

    }
    public static boolean checkRadius(double radius) {
        if (radius > 0) return true;
        else return false;

    }
    public static double calculatePerimeter(double radius) {
        if (checkRadius(radius))
            return Math.PI * 2 * radius;
        else return 0;
    }
    public static double calculateSquare(double radius) {
        if (checkRadius(radius))
        return Math.PI*(radius*radius);
        else return 0;
    }
}
