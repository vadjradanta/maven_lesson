package itCompany;

import itCompany.employee.Desigener;
import itCompany.employee.Developer;
import itCompany.employee.Employee;
import itCompany.employee.Manager;

public class MainItComp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Developer("John", "Smith", 29, 6000,
                        new String[]{"JAVA", "Git", "Maven"}, "MacOS"),

                new Manager("John", "Smith", 29, 6000,
                        true, false),

                new Desigener("John", "Smith", 29, 6000,
                        new String[]{"Mobile Design", "Photoshop", "Sketch"}, "Macbook Pro Over 9000")

        };

        for (Employee employee : employees){
            employee.work();
            System.out.println();
        }

    }
}
