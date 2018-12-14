package itCompany.employee;

public class Manager extends Employee {

    private boolean researchingMarket;
    private boolean teamManaging;

    public Manager() {
    }

    public Manager(String firstName, String lastName, int age, int salary) {
        super(firstName, lastName, age, salary);
    }

    public Manager(boolean researchingMarket, boolean teamManaging) {
        this.researchingMarket = researchingMarket;
        this.teamManaging = teamManaging;
    }

    public Manager(String firstName, String lastName, int age, int salary, boolean researchingMarket, boolean teamManaging) {
        super(firstName, lastName, age, salary);
        this.researchingMarket = researchingMarket;
        this.teamManaging = teamManaging;
    }

    private void manage(){
        if (researchingMarket){
            System.out.println("исследую рынок");
        }
        if (teamManaging){
            System.out.println("управляю командой..");
        }

    }

    public void lounchMeeting() {
        System.out.println("митингую");
    }



    @Override
    public void work() {
        manage();
        lounchMeeting();
        manage();

    }

    public boolean isResearchingMarket() {
        return researchingMarket;
    }

    public void setResearchingMarket(boolean researchingMarket) {
        this.researchingMarket = researchingMarket;
    }

    public boolean isTeamManaging() {
        return teamManaging;
    }

    public void setTeamManaging(boolean teamManaging) {
        this.teamManaging = teamManaging;
    }
}
