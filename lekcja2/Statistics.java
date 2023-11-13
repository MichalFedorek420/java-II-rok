package lekcja2;
import java.util.ArrayList;


public class Statistics {
    private int RangeStart;
    private int RangeEnd;
    private int counter;
    

    public Statistics(int RangeEnd, int RangeStart){
    this.RangeEnd = RangeEnd;
    this.RangeStart = RangeStart;
    this.counter = 0;
    }

    public void NumberOfItems(){
        for (int i = RangeStart; i < RangeEnd+1;i++){
            System.out.println(i);
        }
    }
    public int SumOfNumbers(){
        int x = 0;
        for (int i = RangeStart; i < RangeEnd+1;i++){
            x += i;
            counter++;
        }
        return x;
    }
    public double mean(){
        double y = SumOfNumbers();
        return y / counter;
    }
    public static void main(String[] args) {
        Statistics jeden = new Statistics(5, 1);
        jeden.NumberOfItems();
        System.out.println(jeden.SumOfNumbers());
        System.out.println(jeden.mean());
    }
}
