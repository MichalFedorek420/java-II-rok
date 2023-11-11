package lekcja2;
public class zadFiveTest {
    public static void main(String[] args) {
        int liczba1 = 34;
        int liczba2 = 49;
        int liczba3 = -17;
        float liczba4 = 9;
        float liczba5 = 2;
        double pi =Math.PI;
        double degrees = 90.0;
        int randomNumber = (int) (Math.random() * (liczba2 - liczba1 + 1) + liczba1);
        System.out.println("Sinus 90 stopni = " + Math.sin(Math.toRadians(degrees)));
        System.out.println("Losowa liczba: " + randomNumber);
        System.out.println("Losowa liczba: " + Math.random());
        System.out.println("pierwiastek tych liczb wynosi" +Math.sqrt(liczba4/liczba5));
        System.out.println("Liczba pi wynosi: " + pi);
        System.out.println("Wartość bezwględna liczby 3 to" + Math.abs(liczba3));
        if (liczba1 > liczba2) {
            System.out.println("Liczba 1 (" + liczba1 + ") jest większa od liczby 2 (" + liczba2 + ").");
        } else if (liczba2 > liczba1) {
            System.out.println("Liczba 2 (" + liczba2 + ") jest większa od liczby 1 (" + liczba1 + ").");
        } else {
            System.out.println("Obie liczby są równe: " + liczba1);
        }

    }
}
