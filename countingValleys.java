package HackerRank;

import java.io.*;

public class countingValleys {

    // Complete the countingValleys function below.
    static int countingVals(int n, String s) {
        char[] path = s.toCharArray();
        int altitude = 0;
        int numVal = 0;
        for (int i = 0; i < n; i++){
            if (path[i] == 'D'){
                altitude--;
            }
            if (path[i] == 'U'){
                altitude++;
                if (altitude == 0){
                    numVal++;
                }
            }
        }
        return numVal;
    }

    public static void main(String[] args) throws IOException {
		String s = "UDDDUDUUDUDU";
		int n = s.length();

        int result = countingVals(n, s);
        System.out.println("Number of Valleys in path: " + result);
    }
}
