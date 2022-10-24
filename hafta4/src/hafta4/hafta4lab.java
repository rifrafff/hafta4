package hafta4;

import java.util.Scanner;
public class hafta4lab
{
public static void main(String []args)
{
int c = 0;
Scanner scan = new Scanner ( System.in );

System.out.println("Hangi ulke en cok sera gazi yaymaktadir?");
System.out.println("A)"+" cin");
System.out.println("B)"+" abd");
System.out.println("C)"+" hindistan");
System.out.println("D)"+" japonya");

String in;
in = scan.nextLine();

if(in.equals("A"))
{
System.out.println("Dogru");
c++;
}

else
{
System.out.println("Yanlis");
}

System.out.println("Hangi gezegenin atmosferi kUresel isinma ile yok edilmektedir?");
System.out.println("A)"+" jupiter");
System.out.println("B)"+" venus");
System.out.println("C)"+" mars");
System.out.println("D)"+" neptun");



in=scan.nextLine();

if(in.equalsIgnoreCase("B"))
{
System.out.println("Dogru");
c++;
}

else
{
System.out.println("Yanlis");
}
System.out.println(" Iklim degisikligi nedeniyle yilda kac kisi olmektedir?");
System.out.println("A)"+" 1500");
System.out.println("B)"+" 10000");
System.out.println("C)"+" 150000");
System.out.println("D)"+" 190000");



in=scan.nextLine();

if(in.equalsIgnoreCase("C"))
{
System.out.println("Dogru");
c++;
}

else
{
System.out.println("Yanlis");
}
System.out.println(" Kuresel isinmaya karsi en savunmasiz hayvan hangisidir?");
System.out.println("A)"+" kar leoparo");
System.out.println("B)"+" kutup ayisi");
System.out.println("C)"+" tukan");
System.out.println("D)"+" deniz gergedani");



in=scan.nextLine();

if(in.equalsIgnoreCase("D"))
{
System.out.println("Dogru");
c++;
}

else
{
System.out.println("Yanlis");
}
System.out.println("  Asagidakilerden hangisi kuresel isinmanın olumsuz bir etkisi degildir?");
System.out.println("A)"+" Daha buyuk balik nufusu.");
System.out.println("B)"+" Yeni bulasici hastaliklarin ortaya cikmasi.");
System.out.println("C)"+" TUrlerin yok olmasi.");
System.out.println("D)"+" Kiyi alanlarinin kaybi.");



in=scan.nextLine();

if(in.equalsIgnoreCase("A"))
{
System.out.println("Dogru");
c++;
}

else
{
System.out.println("Yanlis");
}

if(c==5) {
	System.out.println("mukemmel");
}
else if(c==4) {
	System.out.println("cok iyi");
}
else if(c<=3) {
	System.out.println("kuresel isinma hakkindaki bilgilerini tazele");
}else {
	
}





}
}