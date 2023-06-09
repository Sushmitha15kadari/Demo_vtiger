package inhertance;

public class cat extends animal {
	public void meow()
	{
		System.out.println("meow");
	}
public static void main(String[] args) {
	cat c =new cat();
	c.meow();
	c.age(25);
	c.name("lucky");
	
}
}
