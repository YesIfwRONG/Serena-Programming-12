package InheritanceAssignment;

import java.util.ArrayList;

public class Planet {
    private int orbitTime;
    private ArrayList <Moon> moons;
    private String designation;

    public Planet() {
    }

    public Planet(int a, String b){

    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public void addMoons(Moon moons) {
        this.moons.add(moons);
    }

    public ArrayList<Moon>  getMoons() {
        return moons;
    }

    public String toString(){
        return "Planet";
    }

    @Override
    public boolean equals(Object smt){
        return true;
    }


}
