package org.Totalcatification;

import java.util.Objects;

public class Cat extends Animal{

    private boolean toksoplazmos;
    private boolean gender;
    private int weight;

    public Cat(boolean gender, int weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public boolean isToksoplazmos() {
        return toksoplazmos;
    }

    public void setToksoplazmos(boolean toksoplazmos, boolean gender) {
        this.toksoplazmos = toksoplazmos;

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

    public Cat(int age, float pushistost, String name, String poroda, boolean toksoplazmos) {
        super(age, pushistost, name, poroda);
        this.toksoplazmos = toksoplazmos;
    }

    public boolean isGender() {
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
        return toksoplazmos == cat.toksoplazmos &&
                gender == cat.gender &&
                weight == cat.weight;
    }




}
