package WłasneProjekty;
import java.util.List;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Wisielec {
    List<String> words = List.of("samochód","kot","programowanie","komputer");
    String word;
    char[] userWord;
    int lives = 3;
    
    public void play(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        word = words.get(random.nextInt(words.size()));
        userWord = new char[word.length()];
        Arrays.fill(userWord, '_');

        while(!gameEnded()){
            System.out.println(userWord);
            System.out.println("podaj kolejną literę: ");
            System.out.println("pozostało "+lives+" zyć");
            char letter = scanner.nextLine().charAt(0);
            checkLetter(letter);
        }
        if (lives == 0){
            System.out.println("Niestety nie udało Ci się wygrać");
        }else {
            System.out.println("Brawo! Wygrałeś grę!");
        }
        scanner.close();
    }

    private void checkLetter(char letter){
        boolean foundLetter = false;

        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == letter){
                userWord[i] = letter;
                foundLetter = true;

            }
        }
        if (!foundLetter){
            System.out.println("Niestety nie ma takiej litery");
            lives--;
        }
    }

    private boolean gameEnded() {
        return lives == 0 || word.equals(String.valueOf(userWord));
    }
    public static void main(String[] args) {
        Wisielec wisielec = new Wisielec();
        wisielec.play();
    }
}
