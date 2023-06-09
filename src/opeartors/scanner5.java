package opeartors;


	import java.util.Scanner;
	public class scanner5 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value x and y");
			int x=sc.nextInt();
			int y = sc.nextInt();
			System.out.println("before swapping value:"+x+" "+y);
			x=x+y;//x=5+10=15//x=15
			y=x-y;//y=15-10=5//y=5
			x=x-y;//x=15-5=10//x=10
			System.out.println("after swapping value:"+x+" "+y);
sc.close();
}
	}
