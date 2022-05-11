//
//
//
//package ycJava;
//
//import java.security.DomainCombiner;
//
////
////
//
////Casten
////abstract
//
//public class Demo {
// public static void main(String[] args) {
//     Voertuig v1 = new Auto();
//     Tractor t1 = new Tractor();
//     Auto a1 = new Auto();
//     Bestuurder b1 = new Bestuurder();
//     int a = 24;
//     double b = a;   // widening
//     System.out.println(a);
//     System.out.println(b);
//     double c = 25.7;
//     int d = (int)c;
//     System.out.println(d);
//     b1.bestu	ren(t1);
//     b1.besturen(a1);
//     b1.besturen(new JetSki());
// }
//}
//class Bestuurder{
// void besturen(Voertuig v) {
//     v.voortbewegen();
//     System.out.println("we zijn aan het besturen");
//     //Ijsje ij = (Ijsje)v; // compileerfout
//     if(v instanceof Tractor) {
//         Tractor temp = (Tractor) v;
//         temp.aanhanger = "grasmaaier";
//         System.out.println(temp.aanhanger);
//     }else {
//         System.out.println("dit was geen tractor");
//     }
////     v.aanhanger = "grasmaaier";
// }
//}
//class Ijsje{
// 
//}
//abstract class Voertuig{
// int snelheid;
// abstract void voortbewegen();
//}
//class JetSki extends Voertuig{
// void voortbewegen() {
//     System.out.println("in het water voortbewegen");
// }
//}
//class Auto extends Voertuig{
// int passagiers;
// void voortbewegen() {
//     System.out.println("rollen in auto");
// }
//}
//class Tractor extends Voertuig{
// String aanhanger;
// void voortbewegen() {
//     System.out.println("op de trekker");
// }
//}
//
//
//===================
//
//
//class Dier:
// ogen = 0
// def rondrennen(_self):
//     print("rondrennen", _self.ogen)
//
//class Konijn(Dier):
// aantalOren = 2
//
//dier1 = Dier()
//
//dier1.ogen = 5
//
//print(dier1.ogen)
//
//dier1.rondrennen()
//konijn1 = Konijn()
//print(konijn1.ogen)
//
//
//
//===================// Casten
////abstract
////final 
////static
//
//public class Demo {
// public static void main(String[] args) {
//     
//     double back = Math.random();
//     int getal = (int) (back * 100);
//     System.out.println(getal);
//     
//     Scanner sc = new Scanner(System.in);
//     String invoer = sc.nextLine();
//     System.out.println(invoer);
//     
//     
//     Persoon p = new Persoon("15 Mei");
//     Persoon p2 = new Persoon("12 April");
//     //p.vandaag = "11 Mei";
//     //Persoon.vandaag = "12 Mei";
//     System.out.println(p.vandaag);
//     System.out.println(p2.vandaag);
//     String hetwoord = "maandag";
//     Dier naam = new Dier();
//     naam.lopen("go");
//     //Dier dier1 = new Dier();
//     //dier1.
////     charAt(int index)
//     char deletter = hetwoord.charAt(5);
//     System.out.println(deletter);
// }
// void lopen() {
//     System.out.println("lopen");
// }
//}
//class Dier{
// int lopen(String test) {
//     return 9;
// }
//}
//
//class Persoon{
//   static String vandaag;
//   Persoon(String datum){
//       vandaag = datum;
//   }
//}
//
//class Test{
// void gaan() {
//     System.out.println("in gaan");
//     doen();
// }
// void doen() {
//     System.out.println("in doen");
//
//
//	 
//	 
//	 String hetwoord = "maandag";
//	 String groot = hetwoord.toUpperCase();
//	 System.out.println( groot );
//	 
// }
//	 
//}
//}
//
