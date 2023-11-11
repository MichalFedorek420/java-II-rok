package lekcja1;

public class LampsMain {
    public static void main(String[] args) {
        Lamps pnrm = new Lamps();
        Lamps kropki = new Lamps();
        pnrm.SwitchOn();
        kropki.SwitchOFF();
        System.out.println(pnrm.Check());
        System.out.println(kropki.Check());
    }
    
}
