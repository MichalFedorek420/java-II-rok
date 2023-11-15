package lekcja2;


public class Statistics {
    private int RangeStart;
    private int RangeEnd;
    

    public Statistics(int RangeEnd, int RangeStart){
    this.RangeEnd = RangeEnd;
    this.RangeStart = RangeStart;
    }

    public int NumberOfItems(){
        int counter = 0;
        for (int i = RangeStart; i < RangeEnd+1;i++){
            counter++;
        }
        return counter;
    }
    public int SumOfNumbers(){
        int x = 0;
        for (int i = RangeStart; i < RangeEnd+1;i++){
            x += i;
        }
        return x;
    }
    public double mean(){
        double y = SumOfNumbers();
        return y / NumberOfItems();
    }
    @Override
    public String toString(){
        return "Number of items is: "+NumberOfItems()+"\n"+
                "Sum of numbers is: "+SumOfNumbers()+"\n"+
                "Mean of numbers is: "+mean();
    }
    public static void main(String[] args) {
        Statistics jeden = new Statistics(5, 1);
        System.out.println(jeden.NumberOfItems());
        System.out.println(jeden.SumOfNumbers());
        System.out.println(jeden.mean());
        System.out.println(jeden.toString());
    }
}
