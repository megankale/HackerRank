package HackerRank;
import java.util.Arrays;

public class cuttingSticks {
    public static void main(String[] args) {
		int[] array = new int[] { 5, 4, 4, 2, 2, 8 };
        
        Arrays.sort(array);
        
        System.out.println(array.length);
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i-1]) {
                System.out.println(array.length - i);
            }
        }
    }
}