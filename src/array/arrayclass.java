package array;

public class arrayclass {
	public static void main(String[] args) {
			
			int a[];
			int[] b = new int[5];
			b[0] = 5;
			b[1] = 4;
			b[2] = 3;
			b[3] = 2;
			b[4] = 1;
			System.out.println(b[0]);
			System.out.println(b[1]);
			System.out.println(b[2]);
			System.out.println(b[3]);
			System.out.println(b[4]);
			
			for(int k=0;k<b.length;k++)
			{
				System.out.println(b[k]);
			}
			
			int sum = b[0] + b[1];
			System.out.println(sum);
			
			int[] d = {45,56,78};
			for(int e=0;e<d.length;e++)
			{
				System.out.println(d[e]);
			}
			
			int[] f;
			f = new int[] {78,98,100,105};
			for(int g = 0;g<f.length;g++)
			{
				System.out.println(f[g]);
			}
		}

	
	}


