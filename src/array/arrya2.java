package array;

import java.util.Scanner;

public class arrya2 {
	public static void main(String[] args) {
		int[]a1=new int[5];
		Scanner sc= new Scanner(System.in);
		a1[0]=3;
		a1[1]=6;
		a1[2]=1;
		a1[3]=2;
		a1[4]=4;
		int a2 =a1[0]+a1[1]+a1[2]+a1[3]+a1[4];
		int a3=(a2)/4;
		System.out.println(a3);
	}

}
