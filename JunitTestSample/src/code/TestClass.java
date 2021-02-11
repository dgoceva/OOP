package code;

public class TestClass {
	public int square(int x) {
		return x*x;
	}
	public int countNoCaseChar(String text, char sym) {
		int count=0;
		String upperText = text.toUpperCase();
		char uSym = Character.toUpperCase(sym);
		
		for(int i=0;i<text.length();++i) {
			if (upperText.charAt(i)==uSym) {
				count++;
			}
		}
		
		return count;
	}
	public int countChar(String text, char sym) {
		int count=0;
		
		for(int i=0;i<text.length();++i) {
			if (text.charAt(i)==sym) {
				count++;
			}
		}
		
		return count;
	}
}
