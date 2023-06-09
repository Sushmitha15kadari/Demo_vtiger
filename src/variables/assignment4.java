package variables;

public class assignment4 {

	public static void main(String[] args) {

		assignment4.name(10.23,12.35);
		
	}


	public static void name(double c,double f)
	{

		double fahrenheit =(c*1.8)+32;
		double celsium =(f-32)*1.8;
		
		System.out.println(fahrenheit);
		System.out.println( celsium);
		
	}
	
}
