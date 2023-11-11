package lekcja1;

public class speed {
    public static void main(String[] args) {
        int spd = 158;
        boolean mandatCzyNie = check_speed(spd);
        System.out.println("Prędkość samochodu to: " + spd);
        System.out.println("Czy prędkość jest poprawna? " + mandatCzyNie);
    }
    static boolean check_speed(int sped){
        if (sped > 140){
            return false;
        }else if (sped < 40){
            return false;
        }else{
            return true;
        }
    }
}
