package HackerRank;

import java.io.*;
import java.util.*;
import java.lang.Math;

public class nonDivSubset {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int subsetCardinality = 0;
		int[] modBuckets = new int[K];

		for(int i = 0; i < N; i++){
			int bucket = (scan.nextInt() % K);
			modBuckets[bucket] += 1;
		}
		
		if (modBuckets[0] >= 1) {
			subsetCardinality++;
		}
		if (modBuckets[K/2] >= 1 && (K%2== 0)) {
			subsetCardinality++;
		}

		int maxBuckets = 0;
		if (K % 2 == 0) {
			maxBuckets = (K / 2) - 1;
		}
		else {
			maxBuckets = (K / 2);
		}
		
		for (int j = 1; j <= maxBuckets; j++) {
			subsetCardinality += Math.max(modBuckets[j], modBuckets[K - j]);
		}
		System.out.println(subsetCardinality);
		scan.close();
		
    }
}
