package HackerRank;

import java.io.*;

public class sockMerch {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int id = 0;
        int numPairs= 0;
        int[] color = new int[n];

        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                if (ar[i] == ar[j]){
                color[id]++;}
            }
            id++;
        }
        for (int k = 0; k < id; k++){
            if (color[k] > 0){
                int num = color[k]%2;
                numPairs += num;
            }
        }
        return numPairs;
    }

    public static void main(String[] args) throws IOException {

		int[] ar = new int[]{ 10,20,30,30,20,40,10 };
		int n = ar.length;
		
        int result = sockMerchant(n, ar);

        System.out.println(String.valueOf("Number of Pairs of Socks: " + result));
    }
}
