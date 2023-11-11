package lekcja1;

public class bank {
    public static void main(String[] args) {
        double bank_buys = 4.5940;
        double bank_sells = 4.6250;
        double spread = countSpread(bank_buys, bank_sells);
        double roundedSpread = Math.round(spread * 1000.000) / 1000.000;
        System.out.println("Bank buys EUR: " + bank_buys);
        System.out.println("Bank sells EUR: " + bank_sells);
        System.out.println("Spread: " + roundedSpread);
    }
    static double countSpread(double buy,double sell){
        return sell - buy;
    }
}
