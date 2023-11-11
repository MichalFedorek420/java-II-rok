package lekcja1;

public class PhoneBank {
    public static void main(String[] args) {
        Smartphone Komora = new Smartphone(4800,48,6,"Iphone13","Oled");
        Komora.ring(660630987);
        Komora.OpenApp("Signal");
        Komora.Photo();
        System.out.println(Komora.getModel());
    }
    
}
