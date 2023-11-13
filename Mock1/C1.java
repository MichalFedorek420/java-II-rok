package Mock1;

public class C1 {
    private String name;
    private int age;
    public C1(String name, int age){
        this.name = name;
        this.age = age;
    }
    public boolean isAdult(){
        if(age < 18){
            return false;
        } else{
            return true;
        }
    }
    public int getAge(){
        this.age = age;
        return age;
    }
    public String getName(){
        this.name = name;
        return name;
    }
    public void setAge(int NewAge){
        this.age = NewAge;
    }
    public void SetName(String NewName){
        this.name = NewName;
    }
    @Override
    public String toString(){
         return "Name: " + getName() + ", Age: " + getAge();
    }
    public static void main(String[] args) {
        C1 Mikel = new C1("Mikel", 17);
        Mikel.setAge(20);
        System.out.println(Mikel.toString());
    }
    
}
