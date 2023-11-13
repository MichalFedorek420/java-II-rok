package Mock1;

public class C2 {
    private int counter;
    public C2(){
        this.counter = 0;
    }
    public void increase(){
        counter++;
    }
    public void decrease(){
        counter --;
    }
    public void increase(int increaser){
        counter += increaser; 
    }
    public void decrease(int decreaser){
        counter -= decreaser;
    }   
    public int value(){
        return counter;
    }
    public static void main(String[] args) {
        C2 liczba = new C2();
        liczba.increase();
        liczba.increase();
        liczba.decrease();
        liczba.increase(5);
        liczba.decrease(2);
        System.out.println(liczba.value());
    }
}
