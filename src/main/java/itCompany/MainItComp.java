package itCompany;

import itCompany.employee.*;



public class MainItComp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Developer("John", "Smith", 29, 12000,
                        null, "MacOS"),
                new Developer("Frank", "Grow", 21, 8000,
                        null, "Windows"),
                new Developer("Lilian", "Fellow", 22, 7800,
                        null, "Ubuntu"),
                new Developer("Mira", "Gilton", 24, 5400,
                        null, "MacOS"),
                new Developer("Rose", "Giply", 34, 9300,
                        null, "MacOS"),

                new Manager("John", "Smith", 39, 11300,
                        false, true),
                new Manager("Kira", "Snow", 29, 12290,
                        false, true),
                new Manager("John", "Dorian", 32, 16900,
                        false, true),
                new Manager("Gregory", "Nortan", 19, 6400,
                        false, true),


                new Desigener("John", "Smith", 27, 7400,
                        null, "mac"),
                new Desigener("lara", "Croft", 20, 3200,
                        null, "mac"),
                new Desigener("Jason", "Born", 35, 12670,
                        null, "mac"),
                new Desigener("Silvia", "Jeremy", 28, 5350,
                        null, "mac"),
                new Desigener("Natan", "Crow", 26, 7165,
                        null, "mac"),

                new Cleaner("Elizabeth", "Taylor", 21, 8000,
                        true, true, "brush"),
                new Cleaner("Tomas", "Hardy", 27, 5000,
                        true, false, "mop"),
                new Cleaner("John", "Carmac", 33, 11111,
                        false, true, "scoop"),
                new Cleaner("Tim", "Roth", 28, 9797,
                        false, true, "lash"),
                new Cleaner("John", "Snow", 31, 3131,
                        false, true, "skate"),

        };

//        System.out.println(employees[0].getFirstName() + " Зарплата = " + employees[0].getSalary() + ", лет = " + employees[0].getAge());


        /**
         * 1. Посчитать среднее значение по зарплатам всех сотрудников
         */

        float averageSalary = EmployeeUtil.getEmployeesAverageSalary(employees);
        System.out.println("Средняя зарплата в компании = " + averageSalary);
















        for (Employee employee : employees) {
            employee.work();

            if (employee instanceof Developer) {
                System.out.println("Я - " + Developer.class.getSimpleName());
                ((Developer) employee).drinkCoffe();
            }

            if (employee instanceof Manager) {
                System.out.println("Я - " + Manager.class.getSimpleName());
                ((Manager) employee).lounchMeeting();
            }

            if (employee instanceof Desigener) {
                System.out.println("Я - " + Desigener.class.getSimpleName());
                ((Desigener) employee).showSketches();
            }


            System.out.println();
        }

    }
}
