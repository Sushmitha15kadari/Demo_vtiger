package stringmethods1to6;

public class model1 {
	public static void main(String[] args) {
		String s1="kadari";
		String s2="   KaDaRI   ";
		String s3="KADARI";
		String s4="kadari";
		char[] a=s1.toCharArray();

		// Comparisons//
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s2));		
		//contains//
		System.out.println(s1.contains("k"));
		System.out.println(s3.contains("da"));
		System.out.println(s4.contains("i"));	
		//		     // startswith//
		System.out.println(s1.startsWith("k"));
		System.out.println(s1.startsWith("i"));	
		//		      //endswith//
		System.out.println(s1.endsWith("i"));
		System.out.println(s3.endsWith("k"));
		//		
		//		//length//trim
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s2.trim());
		System.out.println(s2.trim().length());
		System.out.println(a);
		System.out.println(s3.toLowerCase());
		System.out.println(s4.toUpperCase());

	}

}
