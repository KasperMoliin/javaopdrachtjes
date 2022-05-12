
public class javaopdracht8 {
public static void main(String[] args) {
	
	Boot zeilboot = new Boot();
	Kapitein Balthazar = new Kapitein ();
	Balthazar.starten(zeilboot);
	Boot speedboot = new Speedboot();
	Balthazar.starten(speedboot);
}
}
class Boot{}


class Speedboot extends Boot{}

class Kapitein{
	void starten(Boot boot) {
		if(boot instanceof Speedboot) {
			System.out.println("Ik zet even mijn pet af");
		}else{
		System.out.println("Lekker weer om te gaan varen, zeg");
		}
		}
	}	

	
