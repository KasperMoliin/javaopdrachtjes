
public class javaopdracht2 {
	public static void main(String[] args) {
		
	
	//			OPDRACHT 2
	String str = "dit is een heerlijke string";
	String str1 = str.toUpperCase();
	int counter = 0;
	int a = 0;		
	for(str1.charAt(a); a < str1.length() ; a++) {
		char letter = str1.charAt(a);
		if(letter == 'E') {
			counter++;				
		}			
	}
	System.out.println(counter);
	}}
