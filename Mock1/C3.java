package Mock1;

public class C3 {
    public static boolean isAlphabet(String t){
        int length = t.length();
        for (int i = 1; i < length; i++){
            if(t.charAt(i) < t.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAlphabet("abcdefg"));
    }
}
