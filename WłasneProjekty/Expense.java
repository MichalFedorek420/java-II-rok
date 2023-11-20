package WłasneProjekty;

public class Expense {
    private final String type;
    private final int month;
    private final double value;
    private final String description;

    public Expense(String type, int month, double value, String description){
        this.type = type;
        this.month = month;
        this.value = value;
        this.description = description;
    }

    public String getType(){
        return type;
    }
    public int getMonth(){
        return month;
    }
    public double getValue(){
        return value;
    }
    public String getDescription(){
        return description;
    }
    
}
