
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	
		int year,chinaZodiac;
		String zodiac="";
		Scanner input=new Scanner(System.in);
		System.out.print("Doğum yılınızı giriniz:");
		year=input.nextInt();
		
		chinaZodiac = year % 12;
		if(chinaZodiac==0)  {
			zodiac="Maymun";
		}
		
		else if(chinaZodiac==1){
			zodiac="Horoz" ;
		}
		else if(chinaZodiac==2){
			zodiac="Köpek";
		}
		else if(chinaZodiac==3){
			zodiac="Domuz";
		}
		else if(chinaZodiac==4){
			zodiac="Fare";
		}
		else if(chinaZodiac==5){
			zodiac="Öküz";
		}
		else if(chinaZodiac==6){
			zodiac="Kaplan";
		}
		else if(chinaZodiac==7){
			zodiac="Tavşan";
		}
		else if(chinaZodiac==8){
			zodiac="Ejderha";
		}
		else if(chinaZodiac==9){
			zodiac="Yılan";
		}
		else if(chinaZodiac==10){
			zodiac="At";
		}
		else if(chinaZodiac==11){
			zodiac="Koyun";
		}
		
		System.out.println("Çin zodyağı burcunuz:" + zodiac);
	}
		
		}
	

