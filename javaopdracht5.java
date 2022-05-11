
public class javaopdracht5 {
	public static void main(String[] args) {
		

	Auto ford = new Auto();
	ford.kapot[3] = true;
	Monteur jantje = new Monteur();
	jantje.repareren(ford);
		
		
		
	
	}
}
class Auto{
	boolean kapot[] = {false,false,false,false}; // motor, deur, vorruit, uitlaat		
	}
	
class Monteur{
	int prijs = 0;
	void repareren(Auto auto) {
		
		if(auto.kapot[0]) {
			System.out.println("de motor doet het niet - betalen!");
			prijs += 25;
		}else if(auto.kapot[1]){
			System.out.println("de deur gaat niet dicht- 25 euro!");
			prijs += 25;
		}else if(auto.kapot[2]){
			System.out.println("je vorruit is stuk- 25 euro aub");
			prijs += 25;
		}else if(auto.kapot[3]){
			prijs += 25;
			System.out.println("de uitlaat is kapot - das niet goedkoop!");}
		System.out.println("Totale prijs wordt: " + prijs);
	}
	
	
	}

