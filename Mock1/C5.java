package Mock1;

public class C5 {
    private int x;
    private int y;

    public C5(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean isX(){
        if (y==0){
            return true;
        }
        return false;
        }
    public boolean isY(){
        if (x==0){
            return true;
        }
        return false;
        }
    public String toString(){
        return "P("+x+","+y+")";
    }
    public static void main(String[] args) {
        C5 wsp = new C5(3,0);
        System.out.println(wsp.isX());
        System.out.println(wsp.isY());
        System.out.println(wsp.toString());
    }

    
    
}
