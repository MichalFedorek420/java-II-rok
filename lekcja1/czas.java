package lekcja1;

public class czas {
    public static void main(String[] args) {
        int hours = 14;
        int minutes = 27;
        System.out.println("Time: "+hours+":"+minutes);
        System.out.println("minutes from midnight: "+ fromMidnighht(hours, minutes)[0]);
        System.out.println("seconds from midnight: "+ fromMidnighht(hours, minutes)[1]);
    }
    static int[] fromMidnighht(int ours,int intues){
        int time_in_seconds = ours * 3600 + intues * 60;
        int time_in_minutes = (ours * 60) + intues;

        
        return new int[]{time_in_minutes, time_in_seconds};
    }
}
