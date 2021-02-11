package utils;

public class StringUtils {
	public static boolean isPalindrome(String text) {
		String cleaned = text.replaceAll("\\s+", "").toLowerCase();
		StringBuilder reverseText = new StringBuilder(text);
		String result = reverseText.reverse().toString();
		
		return cleaned.equals(result);
	}
}
