package HackerRank;

import java.io.*;

public class jumpingClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int len = c.length-1;
        int numJumps = 0;
        int i = 0;
        while (i < len){

            if (i >= len){
                break;
            }
            else if ((i+2 <= len) && c[i+2] == 0){
                System.out.println("double jump ");
                numJumps++;
                i= i+2;
            }
            else if ((i+1 <= len) && c[i+1] == 0){
                System.out.println("single jump");
                numJumps++;
                i = i+1;
            }
            else {
                break;
            }
        }
        return numJumps;
    }

    public static void main(String[] args) throws IOException {
        
		int[] c = new int[] { 0, 0, 0, 0, 1, 0 };

		int result = jumpingOnClouds(c);
		System.out.println("Number of Jumps: " + result);
    }
}