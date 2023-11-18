package WłasneProjekty;
import java.util.Scanner;

public class ExpensesApp {
    public void start(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1. Wyświetl wszystkie wydatki");
            System.out.println("2. Wyświetl wydatki z wybranego miesiąca");
            System.out.println("3. Wyświetl wydatek");
            System.out.println("4. Zakończ aplikacje");
            System.out.println("4. Wybierz opcję: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch(choice){
                case 1 -> System.out.println("Wyswietl wydatki");
            }
        }
    }
}
