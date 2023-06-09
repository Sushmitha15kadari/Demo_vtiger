package array;

import java.util.Arrays;
import java.util.Scanner;

public class arryamerga {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int arry1size = sc.nextInt();
		String[] a1 = new String[arry1size];
		System.out.println("Enter the values: ");
		//int arry3size=sc.nextInt();
	//	String[] a3 = new String[arry3size];//
	//	System.out.println("Enter the values: ");
		
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.next();
		}
		
		System.out.println("Enter Size of Array: ");
		int arry2size = sc.nextInt();
		String[] a2 = new String[arry2size];
		System.out.println("Enter the values: ");
		for(int i=0;i<a2.length;i++)
		{
			a2[i]=sc.next();
		}
		
	//	String a31 =a1[arry1size]+a2[arry1size];
		System.out.println("Input1: "+Arrays.toString(a1));
		System.out.println("Input2: "+Arrays.toString(a2));
	//	System.out.println( a31 );
		sc.close();
	}

}



