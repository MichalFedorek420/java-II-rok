package lekcja1;
public class Student {
    String name;
    int age;
    boolean idcard;
    int idcard_number;
    int semesternumber;
    float averagegrade;
    public void sayHello(){
        System.out.println("Hello from"+name);
    }
    public void dispalyName(){
        System.out.println(name);
    }
    public void displayAge(){
        System.out.println(age);
    }
    public void change_validation(){
        idcard =! idcard;
    }
    public void valid(){
        String valid = (idcard) ? "card is valid" : "card is invalid";
        System.out.println(valid+"\n");
    }
}

    

