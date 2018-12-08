package org.Totalcatification;

import java.util.Objects;

public class Cat extends Animal{

    private boolean toksoplazmos;
    private boolean gender;
    private     int weight;
    private boolean sterilization;

    public Cat(boolean gender, int weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public boolean isToksoplazmos() {
        return toksoplazmos;
    }

    public void setToksoplazmos(boolean toksoplazmos, boolean gender) {
        this.toksoplazmos = toksoplazmos;
        this.gender       = gender;

    }

    public Cat(boolean toksoplazmos) {
        this.toksoplazmos = toksoplazmos;
    }

    public Cat(int age, float pushistost, boolean toksoplazmos) {
        super(age, pushistost);
        this.toksoplazmos = toksoplazmos;
    }

    public Cat(int age, boolean toksoplazmos) {
        super(age);
        this.toksoplazmos = toksoplazmos;
    }

    public Cat(int age, float pushistost, String name, String poroda, boolean toksoplazmos, boolean gender, int weight, boolean sterilization) {
        super(age, pushistost, name, poroda);
        this.toksoplazmos  = toksoplazmos;
        this.gender        = gender;
        this.weight        = weight;
        this.sterilization = sterilization;
    }

    public boolean isGender() {
        boolean male   = false;
        boolean female = false;
        if (gender){
            gender = male;
        } else {
            gender = female;
        }

        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isSterilization() {

        boolean sterialized   = false;
        boolean unsterialized = false;

        if (sterilization){
            sterilization = sterialized;
        }else{
            sterilization = unsterialized;
        }

        return sterilization;
    }

    public void setSterilization(boolean sterilization) {
        this.sterilization = sterilization;
    }



    public void panicRun(){
        System.out.println("Не догонишь, собака!!!");
    }

    public void fuff() { System.out.println("шшшшшшшшшшумелкакмышшшшшшь"); }

    public void caterwaul() { System.out.println("мяу-мяу"); }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return toksoplazmos   == cat.toksoplazmos &&
                gender        == cat.gender &&
                weight        == cat.weight &&
                sterilization == cat.sterilization;
    }

    public boolean isDetermination(){

        boolean state   = false;
        boolean unstate = false;

            if (determination){
                determination = state;
            }else{
                determination = unstate;
            }
            return determination;
    }
}
