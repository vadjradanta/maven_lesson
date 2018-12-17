package itCompany.employee;

public class Cleaner extends Employee {
    private boolean cleaningOffice;
    private boolean grumble;
    private String equipment;


    public Cleaner() {
    }

    public Cleaner(boolean cleaningOffice, boolean grumble, String equipment) {
        this.cleaningOffice = cleaningOffice;
        this.grumble = grumble;
        this.equipment = equipment;
    }

    public Cleaner(String firstName, String lastName, int age, int salary, boolean cleaningOffice, boolean grumble, String equipment) {
        super(firstName, lastName, age, salary);
        this.cleaningOffice = cleaningOffice;
        this.grumble = grumble;
        this.equipment = equipment;
    }

    @Override
    public void work() {
        cleaningOffice();
        grumble();
        cleaningOffice();
    }

    public void cleaningOffice() {
        String spec = "";
//        for (String item : equipment) {
//            spec = spec + ", " + item;
//        }

        System.out.println("Мою... Использую " + spec);
    }

    public void grumble() {
        System.out.println("Моешь, тут моешь, а они опять с грязными лапами припёрлись!");
    }

    public boolean isCleaningOffice() { return cleaningOffice; }

    public void setCleaningOffice(boolean cleaningOffice) {
        this.cleaningOffice = cleaningOffice;
    }

    public boolean isGrumble(boolean grumble){
        return grumble;
    }

    public void setGrumble(boolean grumble){
        this.grumble = grumble;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }
}
