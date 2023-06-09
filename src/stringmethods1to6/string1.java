package stringmethods1to6;

import java.util.Scanner;

public class string1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String Input = sc.nextLine();
		System.out.println("Input: "+Input);
		System.out.println("Output: "+Input.length());
		sc.close();
		
	}

}
