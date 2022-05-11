import java.util.Arrays;
import java.util.Scanner;

public class javaopdracht6 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Some frietjes are saying hallo to you. What do you answer?");
	    
		String str = myObj.nextLine();
//		String str = "Halloooo";
//		System.out.println(str);
		
		String[] friet = new String[str.length()];

		for(int i=0; i < str.length(); i++ ) {
			char letter = str.charAt(i);
			String letterString = String.valueOf(letter);
			friet[i] = letterString.toUpperCase();
		}
		Arrays.sort(friet);
		System.out.println("Sorted by alphabet");
		for(int i=0; i<friet.length ; i++) {
		System.out.println(friet[i]);
		}
	}
}
