package opeartors;

import java.util.Scanner;

public class scanner3 {
	public static void main(String[] args) {
		Scanner x =new Scanner(System.in);
		System.out.println(" enter  the number");
		int num =x.nextInt();
		if(num %2!=0)
		{
			System.out.println(num+ " number is odd ");
		}
		else
		{
			System.out.println(num+ " number is not odd ");
		}
		x.close();
	}

}
