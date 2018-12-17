package itCompany.employee;

public abstract class Employee {
    private String FirstName;
    private String LastName;
    private int    age;
    private int    salary;
    private float  vacation;

    protected Employee() {
    }

    Employee(String firstName, String lastName, int age, int salary) {
        FirstName   = firstName;
        LastName    = lastName;
        this.age    = age;
        this.salary = salary;

    }

    public abstract void work();

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public float getVacation() {
        return vacation;
    }

    public void setVacation(float vacation) {
        this.vacation = vacation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", vacation=" + vacation +
                '}';
    }
}
