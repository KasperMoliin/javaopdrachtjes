import java.util.Arrays;

public class javaopdracht4 {
	public static void main(String[] args) {
		int[] rando = new int[10];
		for (int i=0; i < rando.length ; i++) {
			rando[i] = (int)(Math.random()*100);			
		}
		System.out.println("----------------------------");
		System.out.println("Unsorted");
		System.out.println("----------------------------");
		for (int i=0; i < rando.length ; i++) {
			System.out.println(rando[i]);
		}
		System.out.println("----------------------------");
		System.out.println("Sorted");
		System.out.println("----------------------------");
		Arrays.sort(rando);
		for (int i=0; i < rando.length ; i++) {
			System.out.println(rando[i]);
			
		}
}
}
