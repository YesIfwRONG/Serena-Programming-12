package InheritanceAssignment;

import java.awt.*;

public class GasPlanet extends Planet{

    private boolean hasRings;

    private Color color;

    public GasPlanet(int a, String b, boolean c, Color d){

    }

    public boolean isHasRings(){
        return hasRings;
    }

    public void setHasRings(boolean hasRings){
        this.hasRings = hasRings;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public String toString(){
        return "GasPlanet";
    }
}
