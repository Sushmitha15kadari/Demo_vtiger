package variables;

public class assignment5 {
	
	public static void main(String[] args) {

		assignment5 as = new assignment5();
		as.name(10.23,12.35);	

	}


	public void name(double c,double f)
	{

		 f =(c*1.8)+32;
		 c=(f-32)*1.8;
		
		
		System.out.println(f);
		System.out.println(c);
		
		
	}

}


