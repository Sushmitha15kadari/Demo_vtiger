package stringmethods1to6;

public class stringmax {
	private static Object minLengthWord;

	public static void main(String[] args, String minLenghtWord) {
		String input = "Hello, What work assigned for you";
		String[] words = input.split("\\s+"); 
		String maxLengthWord = ""; 

		for (String word : words) {
			if (word.length() > maxLengthWord.length()) 
			{
				maxLengthWord = word; 
			}
			if(word.length()< ((String) minLengthWord).length())
			{
				minLenghtWord=word;
			}
		}

		System.out.println("The max length word in the input string is: " + maxLengthWord);
		System.out.println("The min length word in the input string is: " + minLengthWord);

	}
}
