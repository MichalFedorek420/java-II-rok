package lekcja1;

public class CounterMain {
    public static void main(String[] args) {
        Counter licznik = new Counter();
        Counter DrugiLicznik = new Counter();
        licznik.increaserOne();
        licznik.increaserOne();
        licznik.increaserOne();
        licznik.increaserTen();
        licznik.increaserTen();
        DrugiLicznik.decreaserTen();
        DrugiLicznik.decreaserTen();
        DrugiLicznik.decreaserTen();
        DrugiLicznik.decreaserTen();
        DrugiLicznik.decreaserTen();
        DrugiLicznik.increaserOne();
        DrugiLicznik.increaserOne();
        DrugiLicznik.increaserOne();
        System.out.println("Licznik jeden: "+licznik.getCount());
        System.out.println("Licznik dwa: "+DrugiLicznik.getCount());

    }
}
