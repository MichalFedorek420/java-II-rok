package lekcja1;

public class Smartphone {
    private int battery;
    private int megapixels;
    private int screen_size;
    private String model;
    private String screen_type;

    public Smartphone(int battery, int megapixels, int screen_size, String model, String screen_type){
        this.battery = battery;
        this.megapixels = megapixels;
        this.screen_size = screen_size;
        this.model = model;
        this.screen_type = screen_type;

    }
    public void ring(int phoneNumber){
        System.out.println("Calling to: "+phoneNumber);
    }
    public void OpenApp(String appName){
        System.out.println("Opening: "+ appName);
    }
    public void Photo(){
        System.out.println("making a photo...");
    }
    public String getModel(){
        return this.model;
    }
}
