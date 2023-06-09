package stringmethods1to6;

import java.util.Arrays;

public class string10 {
	public static void main(String[] args) {
		String s1 = "Hel$lo Kir$an How Ar$e You";
		String s2 = "9490369295";
		
		// Using Index of Method
		System.out.println(s1.indexOf("Y"));
		
		// Using Last Index of Method
		System.out.println(s1.lastIndexOf("H"));
		
		// Using SubString
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2, 8));

		// Using Split
		System.out.println(Arrays.toString(s1.split("\\$")));
		
		// Using CharAt
		System.out.println(s1.charAt(8));
		
		// Using Replace Method
		System.out.println(s1.replace("K", "W"));
		System.out.println(s1.replace("Kir$an", "Naveen"));
		
		// Using Value Of Method
		System.out.println(String.valueOf(s2));
	
	}
 


		
	}


