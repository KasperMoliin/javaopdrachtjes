import java.util.Arrays;
import java.util.Scanner;

public class javaopdracht10 {
public static void main(String[] args) {
wordGame();
	}

static void wordGame(){
	Scanner invoer = new Scanner(System.in);
	String[] history = new String[2];
	
	System.out.println("enter word");
	history[0] = invoer.next();
	
	char endLetter = history[0].charAt(history[0].length()-1);
	System.out.println("enter word beginning with " + endLetter);
	
	for(int i=1; i<history.length +1 ;i++) {
	//String word = invoer.next();
	history[i] = invoer.next();
	history = Arrays.copyOf(history, history.length + 1);
	System.out.println(Arrays.toString(history));
	char startLetter = history[i].charAt(0);
	char pastEndLetter = history[i-1].charAt(history[i-1].length()-1);
	char endLetter1 = history[i].charAt(history[i].length()-1);
	System.out.println(pastEndLetter);
	System.out.println(startLetter);
	System.out.println("enter word beginning with " + endLetter1);
	}
}}

//Maak een programma dat werkt als het bekende "Ik ga op vakantie en neem mee...".

//Je voert een item in: bijvoorbeeld "tandenborstel".
//Daarna moet de volgende invoer met de laatste letter van tandenborstel beginnen, een "l":
//
//"Lepel" wordt geaccepteerd. "Vork" niet.
//Als iemand "Lasdoos" invult, dan toont het programma:
//Gezegd is: Tandenborstel, Lasdoos
//
//Voer het volgende item in:
//Het volgende item dient dan weer met een s te beginnen. Andere invoer wordt niet geaccepteerd.

