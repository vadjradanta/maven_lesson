package itCompany.employee;

public class Desigener extends Employee {
    private String[] desigenerSkillSet;
    private String   computer;

    public Desigener(){

    }

    public Desigener(String[] desigenerSkillSet, String computer) {
        this.desigenerSkillSet = desigenerSkillSet;
        this.computer = computer;
    }

    public Desigener(String firstName, String lastName, int age, int salary, String[] desigenerSkillSet, String computer) {
        super(firstName, lastName, age, salary);
        this.desigenerSkillSet = desigenerSkillSet;
        this.computer = computer;
    }

    public String[] getDesigenerSkillSet() {
        return desigenerSkillSet;
    }

    public void setDesigenerSkillSet(String[] desigenerSkillSet) {
        this.desigenerSkillSet = desigenerSkillSet;
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    @Override
    public void work() {
        draw();
        showSketches();
        draw();

    }

    private void draw(){
        System.out.println("Рисую рисование...");
    }

    public void showSketches(){
        System.out.println("Есть чем поглядеть?..");
    }
}
