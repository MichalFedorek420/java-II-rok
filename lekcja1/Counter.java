package lekcja1;

public class Counter {
    private int count;

    public Counter(){
        this.count = 0;
    }

    public int increaserOne(){
        return this.count+=1;
    }

    public int increaserTen(){
        return this.count+=10;
    }

    public int decreaserOne(){
        return this.count-=1;
    }

    public int decreaserTen(){
        return this.count-=10;
    }

    public int Reset(){
        return this.count=0;
    }

    public int getCount(){
        return this.count;
    }
    
}
