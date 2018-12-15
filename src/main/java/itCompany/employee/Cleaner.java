package itCompany.employee;

public class Cleaner extends Employee {
    private boolean   cleaningOffice;
    private String[] equipment;

    public Cleaner() {
    }

    public Cleaner(boolean cleaningOffice, String[] equipment) {
        this.cleaningOffice = cleaningOffice;
        this.equipment      = equipment;
    }

    public Cleaner(String firstName, String lastName, int age, int salary, boolean cleaningOffice, String[] equipment) {
        super(firstName, lastName, age, salary);
        this.cleaningOffice = cleaningOffice;
        this.equipment      = equipment;
    }

    @Override
    public void work() {
        cleaningOffice();
        grumble();
        cleaningOffice();
    }

    public void cleaningOffice() {
        String spec = "";
        for (String item : equipment) {
            spec = spec + ", " + item;
        }

        System.out.println("Мою... Использую " + spec);
    }

    public void grumble() {
        System.out.println("Моешь, тут моешь, а они опять с грязными лапами припёрлись!");
    }

    public boolean getCleaningOffice() {
        return cleaningOffice;
    }

    public void setCleaningOffice(boolean cleaningOffice) {
        this.cleaningOffice = cleaningOffice;
    }

    public String[] getEquipment() {
        return equipment;
    }

    public void setEquipment(String[] equipment) {
        this.equipment = equipment;
    }
}
