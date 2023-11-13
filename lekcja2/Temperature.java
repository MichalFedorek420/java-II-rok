package lekcja2;

public class Temperature {
    private int celcius;
    private final double CELCIUS_TO_KELVIN;
    private final int CELCIUS_TO_FAHRENHEIT;

    public Temperature(int celcius){
        this.celcius = celcius;
        CELCIUS_TO_KELVIN = 273.15;
        CELCIUS_TO_FAHRENHEIT = 32;
    }
    public double CelciusToKelvin(){
        return celcius + CELCIUS_TO_KELVIN;
    }
    public double CelciusToFahrenheit(){
        return (celcius / 5) * 9 + CELCIUS_TO_FAHRENHEIT;
    }
        public static void main(String[] args) {
            Temperature Kielce = new Temperature(15);
            System.out.println(Kielce.CelciusToKelvin());
            System.out.println(Kielce.CelciusToFahrenheit());
        }
}
