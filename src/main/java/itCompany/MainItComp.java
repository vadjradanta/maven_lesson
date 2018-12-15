package itCompany;

import itCompany.employee.*;

import javax.swing.*;

public class MainItComp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Developer("John", "Smith", 29, 6000,
                        new String[]{"JAVA", "Git", "Maven"}, "MacOS"),

                new Manager("John", "Smith", 29, 6000,
                        true, false),

                new Desigener("John", "Smith", 29, 6000,
                        new String[]{"Mobile Design", "Photoshop", "Sketch"}, "Macbook Pro Over 9000"),
                new Cleaner("Elizabeth", "Taylor", 21, 8000, true, new String[]{"mop", "brush", "scoop"})

        };

        for (Employee employee : employees){
            employee.work();

            if(employee instanceof Developer) {
                System.out.println("Я - " + Developer.class.getSimpleName());
                ((Developer)employee).drinkCoffe();
            }

            if (employee instanceof Manager) {
                System.out.println("Я - " + Manager.class.getSimpleName());
                ((Manager)employee).lounchMeeting();
            }

            if (employee instanceof Desigener) {
                System.out.println("Я - " + Desigener.class.getSimpleName());
                ((Desigener)employee).showSketches();
            }



            System.out.println();
        }

    }
}
