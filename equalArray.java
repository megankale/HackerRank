package HackerRank;
import java.util.*;

import java.io.*;

public class equalArray {

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
		Map<Integer, Integer> mp = new HashMap<>(); 
   int n = arr.length;
   // Traverse through array elements and 
   // count frequencies 
   for (int i = 0; i < n; i++) 
   { 
	   if (mp.containsKey(arr[i]))  
	   { 
		   mp.put(arr[i], mp.get(arr[i]) + 1); 
	   }  
	   else
	   { 
		   mp.put(arr[i], 1); 
	   } 
   } 
   // Traverse through map and print frequencies 
   Map.Entry<Integer, Integer> maxEntry = null;
   for (Map.Entry<Integer, Integer> entry : mp.entrySet()) 
   { 
	   if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue())> 0){
		   maxEntry = entry;
	   } 
   } 
   return (n-maxEntry.getValue());

}

    public static void main(String[] args) throws IOException {

        int[] arr = new int[] {10, 20, 20, 10, 10, 20, 5, 20};
		int result = equalizeArray(arr);
		System.out.println("Number of minimum elements to remove: " + result);
        
    }
}
