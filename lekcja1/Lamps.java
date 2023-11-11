package lekcja1;

public class Lamps {
    private Boolean onof;

    public Lamps(){
        this.onof = false;
    }

    public void SwitchOn(){
        this.onof = true;
        System.out.println("Lamp is now on");
    }

    public void SwitchOFF(){
        this.onof = false;
        System.out.println("Lamp is now off");
    }

    public String Check(){
        return onof ? "Lamp is on" : "Lamp is off";
    }
    
}
