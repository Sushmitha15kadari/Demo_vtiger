package inhertance;

public class student extends person1 {
	public void grade() {
		
		char grade ='A';
		System.out.print(grade);
		
	}
	public static void main(String[] args) {
		student s=new student();
		s.age(25);
		s.name("kadari");
		s.grade();
		
	}

}
