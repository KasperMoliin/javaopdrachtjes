import java.util.Scanner;

public class opdracht7 {
public static void main(String[] args) {
	Scanner lingoScan = new Scanner(System.in);
	System.out.println("Enter a 5 letter word");
	String poging1 = lingoScan.next();
	String goedAntwoord = "friet";
	char[] pogingArray = new char[5];
	char[] answerKey = new char[5];
		if (poging1.equalsIgnoreCase(goedAntwoord)) {
		System.out.println("Horraaaayyyy");
		}else {
	for(int i=0; i < goedAntwoord.length(); i++) {
		pogingArray[i] = poging1.charAt(i);		
		if(Character.compare(pogingArray[i], goedAntwoord.charAt(i))== 0){
			answerKey[i] = '2';
		}else if(goedAntwoord.indexOf(pogingArray[i])!= -1) {
			answerKey[i] = '1';
		}else {
			answerKey[i] = '0';
		}
	}
	System.out.println(answerKey);}



}
}