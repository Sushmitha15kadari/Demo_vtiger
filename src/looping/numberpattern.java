package looping;

public class numberpattern {
	public static void main(String[] args) {
		int n=6;
	
		for(int i=1;i<=6;i++)
		{
			int p=1;
			for(int j=1;j<=i;j++) 
			{
				System.out.print(p+++" ");
			}System.out.println();
		}
	}

}
