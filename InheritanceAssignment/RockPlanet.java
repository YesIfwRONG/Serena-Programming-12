package InheritanceAssignment;

public class RockPlanet extends Planet{
    private boolean habitable;

    public RockPlanet(int a, String b, boolean c) {

    }

    public boolean isHabitable(){
        return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }

    public String toString(){
        return "RockPlanet";
    }
}
