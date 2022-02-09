package InheritanceAssignment;

import java.util.ArrayList;

public class Moon {
    private int orbitTime;
    private boolean atmosphere;
    private String designation;
    private Planet planet;

    public Moon(Planet planet, int orbitTime, boolean atmosphere, String designation) {
        this.planet = planet;
        this.orbitTime = orbitTime;
        this.atmosphere = atmosphere;
        this.designation = designation;
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

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    public Planet getPlanet() {
        return planet;
    }

    public String toString(){
        return "Moon";
    }

    public void setAtmosphere(boolean atmosphere){
        this.atmosphere = atmosphere;
    }

    public boolean isAtmosphere(){
        return atmosphere;
    }

    @Override
    public boolean equals(Object smt){
        return true;
    }

}
