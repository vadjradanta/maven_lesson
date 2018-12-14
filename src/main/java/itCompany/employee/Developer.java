package itCompany.employee;

public class Developer extends Employee{
    private String[] programmingSkillSet;
    private String   preferedOS;

    public Developer(){

    }

    public Developer(String firstName, String lastName, int age, int salary, String[] programmingSkillSet, String preferedOS){
        super(firstName, lastName, age, salary);
        this.programmingSkillSet = programmingSkillSet;
        this.preferedOS          = preferedOS;

    }


    @Override
    public void work() {
        writeCode();
        drinkCoffe();
        eatCookie();
        writeCode();

    }

    public void drinkCoffe(){
        System.out.println("Пью кофе");
    }

    public void eatCookie() {
        System.out.println("Ем печеньки...");
    }

    private void writeCode(){
        String techs = "";
        for (String skill : programmingSkillSet) {
            techs = techs + ", " +skill;
        }
        System.out.println("Пишу код... Использую " + techs);
    }



    public String[] getProgrammingSkillSet() {
        return programmingSkillSet;
    }

    public void setProgrammingSkillSet(String[] programmingSkillSet) {
        this.programmingSkillSet = programmingSkillSet;
    }

    public String getPreferedOS() {
        return preferedOS;
    }

    public void setPreferedOS(String preferedOS) {
        this.preferedOS = preferedOS;
    }
}

    class Test {
        public static void main(String[] args) {
            Developer developer = new Developer();
            developer.work();
        }
    }


