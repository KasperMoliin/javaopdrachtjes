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
	history[0] = invoer.next(); 	//first array item has to be here because the next function uses i-1
	
	char FirstEndLetter = history[0].charAt(history[0].length()-1);
	System.out.println("enter word beginning with " + FirstEndLetter);
	
	for(int i=1; i<history.length +1 ;i++) {
		String temp = invoer.next();
		
		char startLetter = temp.charAt(0);
		char pastEndLetter = history[i-1].charAt(history[i-1].length()-1);
		char endLetter = temp.charAt(temp.length()-1);
//		System.out.println(pastEndLetter);
//		System.out.println(startLetter);
		if(Arrays.asList(history).contains(temp)) { 					//checks if word has already been used
			System.out.println(temp + " has already been said");
			System.out.println("enter word beginning with " + pastEndLetter);
			i=i-1;
		}
		else if(Character.compare(pastEndLetter, startLetter) == 0) {   //if word is correct
			System.out.println("enter word beginning with " + endLetter);
			history[i] = temp;
			System.out.println("Gezegd is: " + Arrays.toString(history));
			history = Arrays.copyOf(history, history.length + 1);
		}else {	//if start letter is wrong
			System.out.println("word has to start with " + pastEndLetter);
			i=i-1;
			
			 
		}
	
	}
}
}

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

