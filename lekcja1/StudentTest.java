package lekcja1;
public class StudentTest{
    public static void main(String[] args){
        Student s = new Student();
        s.age = 21;
        s.name = "ziomek";
        s.semesternumber = 3;
        s.averagegrade = 4.4f;
        s.idcard = true;
        s.idcard_number = 42069;
        s.change_validation();
        Student b = new Student();
        b.age =19;
        b.name = "luzny ziomek";
        b.semesternumber = 3;
        b.averagegrade = 4.2f;
        b.idcard = true;
        b.idcard_number = 12345;
        
        System.out.println(s.name + " " + s.semesternumber + " "+s.averagegrade);
        System.out.println(b.name + " " + b.semesternumber + " "+b.averagegrade);
        System.out.println(s.name + " "+ s.idcard_number+" "+s.idcard);
        System.out.println(b.name + " "+ b.idcard_number+" "+b.idcard);
    }
}