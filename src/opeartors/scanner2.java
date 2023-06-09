package opeartors;

import java.util.Scanner;

public class scanner2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		
		if(num %2 ==0)
		{
			System.out.println(num+ " number is even ");
		}
		
		else 
		{
			System.out.println(num+ " number is not even ");
		}
		sc.close();
	}}

