package inhertance;

public class dog extends Animal1 {
	
	public void bark()
	{
	System.out.println("bark");	
	}
	public static void main(String[] args) 
	{
	dog d=new dog();
	d.bark();
	d.age(22);
	d.name("pinky");
	
	}
	
	}


