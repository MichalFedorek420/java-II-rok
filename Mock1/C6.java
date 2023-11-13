package Mock1;

public class C6 {
    private String title;
    private int pages;

    public int Getpages(){
        return pages;
    }
    public void SetPages(int pages){
        if (pages > 0){
        this.pages = pages;
        }
    }
    public String GetTitle(){
        return title;
    }
    public void SetTitle(String title){
        this.title = title;
    }
    public static void main(String[] args) {
        C6 o = new C6();
        o.SetPages(3);
        o.SetPages(-4);
        System.out.println(o.Getpages());

    }
}
