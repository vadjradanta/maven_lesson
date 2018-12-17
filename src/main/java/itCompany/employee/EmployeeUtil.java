package itCompany.employee;

public class EmployeeUtil {
    /**
     * Пустой класс для утильного статического класса
     */
    private EmployeeUtil() {}

    public static float getEmployeesAverageSalary(Employee[] employees) {
        float sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum / employees.length;
    }

    /**
     * Получить среднее значение зарпалты для определённого класса сотрудников
     * @param employees employees список сотрудников
     * @param clazz типа сотрудников (исходное)
     * @return среднее значение
     */

    public static float getEmloyeesAverageSalary(Employee[] employees, Class clazz){
        //TODO implement
        return 0f;
    }

    /**
     * Получить сотрудников старше, чем переданное значение
     * @param age возраст
     * @return новый массив из сотрудников соответствующих критерию
     */
    public static Employee[] getEmployeeOlderThan(Employee[] employees, int age){
        int counter = 0;
        for (Employee employee : employees) {
            if (employee.getAge() > age) {
                counter++;
            }
        }

            Employee[] newEmployees = new Employee[counter];
            int i = 0;
            for (Employee employee : employees) {
                if (employee.getAge() > age){
                    newEmployees[i++] = employee;
                }
            }
            return newEmployees;
    }

    public static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

}
