package stringmethods1to6;

public class stringassignment {
	String str="I8Lo$ve6M&y9I*n7_dia";
	int uppercaseCount = 0;
    int lowercaseCount = 0;
    int specialCount = 0; 
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        if (Character.isUpperCase(ch))
        {
            uppercaseCount++;
        }
        else if (Character.isLowerCase(ch))
        {
            lowercaseCount++;
        } 
        else if (Character.isDigit(ch))
        {
            specialCount++;
        }
       
    }

    System.out.println("Uppercase letters: " + uppercaseCount);
    System.out.println("Lowercase letters: " + lowercaseCount);
    System.out.println("Digits: " + digitCount);
   System.out.println("Special characters: " + specialCount);
}

}
