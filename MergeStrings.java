import java.util.Scanner;

public class MergeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 strings : ");
		String word1 = sc.next();
		String word2 = sc.next();
		String newStr = "";
		
		int minLen = word1.length() < word2.length() ? word1.length() : word2.length();

		for(int idx = 0; idx < minLen; idx++) {
			newStr += word1.charAt(idx) + "" + word2.charAt(idx);
		}
		
		if(minLen < word1.length()) {
			for(int idx = minLen; idx < word1.length();idx++) {
				newStr += word1.charAt(idx);
			}
		}
		
		if(minLen < word2.length()) {
			for(int idx = minLen; idx < word2.length();idx++) {
				newStr += word2.charAt(idx);
			}
		}
		
		System.out.println(newStr);
		
		sc.close();
	}

}
