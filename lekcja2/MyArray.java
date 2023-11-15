package lekcja2;
import java.util.Arrays;

public class MyArray {
    public static int even(int[] array){
        for ( int number : array){
            if (number % 2 == 0 ){
                return number;
            }
        }
        return -1;
    }
    public static int[] reverse(int[] array){
        int[] arr2 = new int[array.length];
        for (int i = 0; i < array.length; i++){
            arr2[array.length -1 - i] = array[i];
        }return arr2;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        System.out.println(even(arr1));

        System.out.println(Arrays.toString(reverse(arr1)));
    }
}
