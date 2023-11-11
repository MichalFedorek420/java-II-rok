package lekcja2;

public class MyCalendar {
    static int year = 2023;
    static int month = 4;
    static int day = 9;
static String myDate(){
    return String.format("%04d-%02d-%02d",year, month, day);
}
static int days(){
    int[] daysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    int totalDays = day;
    for (int i = 1; i < month; i++) {
        totalDays += daysInMonth[i];
    }

    return -1;
}
    public static void main(String[] args) {
        System.out.println(myDate());
    }
}
