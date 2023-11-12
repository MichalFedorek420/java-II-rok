package lekcja2;

public class CinemaTicket {
    static String cinemaName = "FedorKino";
    private String filmtitle;
    private int row;
    private int seat;
    private int price;

    public CinemaTicket(String filmtitle, int row, int seat) {
        this.filmtitle = filmtitle;
        this.row = row;
        this.seat = seat;
        if(row <= 2){
            this.price = 10;
        }else {
            this.price = 25;
        }

    }
    public CinemaTicket(String filmtitle, int row, int seat, int price){
        this.filmtitle = filmtitle;
        this.row = row;
        this.seat = seat;
        this.price = price;
    }
    public String Ticket(){
        return "Cinema name: "+cinemaName+
                " Seat: "+this.seat+
                " Row: "+this.row+
                " Film tittle: "+this.filmtitle+
                " Price: "+this.price;
    }
    public static void main(String[] args) {
        CinemaTicket BiletJeden = new CinemaTicket("Batman", 4, 9 );
        CinemaTicket BiletDwa = new CinemaTicket("Batman 2", 5, 10 );
        System.out.println(BiletJeden.Ticket());
        System.out.println(BiletDwa.Ticket());
    }
}
