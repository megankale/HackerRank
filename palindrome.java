package HackerRank;

import java.util.Scanner;
//length/2 = even length strings
//length-1/2 = odd length strings


class palindrome{

	public static boolean isPal(String s){
		char[] c = s.toCharArray();
		for (int i = 0; i <= (s.length()-1)/2; i++){
			if (c[i] != c[s.length()-1-i]){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text: ");
    	String s = input.next();
		int n = 2; //min length of palindrome
		for (int i = 0; i < (s.length() - 1); i++) {
			System.out.println("i: " + i);
			for (int j = i + n; j < (s.length() + 1); j++) {
				System.out.println("j: " + j);
				if (isPal(s.substring(i, j))) {
					System.out.println(s.substring(i, j));
				}
			}
		}
		input.close();
	}
}
