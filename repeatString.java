package HackerRank;

import java.io.*;
import java.util.*;
public class repeatString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int stringLength = s.length();
        long numReps = n/ stringLength;
        long numRemainder = n % stringLength;
        char c;
        int countA = 0;
        int count = 0;
        for (int i = 0; i < stringLength; i++){
            c = s.charAt(i);
            if (c == 'a'){
                countA++;
            }
        }
        if (numRemainder == 0){
            return countA*numReps;
        }
        else {
            for (int i = 0; i < numRemainder; i++){
                c = s.charAt(i);
                if (c == 'a'){
                    count++;
                }
            }
            return ((countA*numReps) + count);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
		System.out.println("Number of a's in string: " + result);
        scanner.close();
    }
}
