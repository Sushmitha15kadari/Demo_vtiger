package stringmethods1to6;

import java.util.Scanner;

public class string3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String Input = sc.nextLine();
		System.out.println("Enter the target Character");
		char Targchar = sc.next().charAt(0);
	    System.out.println("Input: "+Input);
		System.out.println("Target Character: "+Targchar);
		int count = 0;
		for(int i=0;i<Input.length();i++)
		{
			if(Input.charAt(i) == Targchar)
				count++;
		}
		System.out.println("Output: "+count);
		sc.close();

	}
}