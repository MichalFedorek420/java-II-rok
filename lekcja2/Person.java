package lekcja2;

public class Person {
    private String name;
    private int weight;
    private int height;

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int weight, int height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void setWeightAndHeight(int weight,int height){
        this.weight = weight;
        this.height = height;
    }
    public int calculateBMI(){
        int x = (weight * 10000) / (height * height );
        return x;
    }
    public void displayRecord() {
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("BMI: " + calculateBMI());
        
    }
    
    
    public static void main(String[] args) {
        Person Ja = new Person("Michal", 70, 186);
        Ja.displayRecord();
    }
}

