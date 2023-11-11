package lekcja1;

public class jednostki {
    public static void main(String[] args) {
        double inches = 0;
        int cm = 170;
        double feet = 0;
        feet = cm / 30.48;
        inches = cm / 2.54;
        //int roundedInt = (int) Math.round(x);
        int roundedfeet = (int) Math.round(feet);
        int roundedinchees = (int) Math.round(inches);
        System.out.println("Wartość w cm: " + cm);
        System.out.println("Wartość w stopach: " + roundedfeet);
        System.out.println("Wartość w calach: " + roundedinchees);
    }
    }

