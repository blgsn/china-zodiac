
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	
		int year,chinaZodiac;
		String zodiac="";
		//gets the value from the user
		Scanner input=new Scanner(System.in);
		System.out.print("Doğum yılınızı giriniz:");
		year=input.nextInt();
		//finds the corresponding zodiac signs in the chinese zodiac 
		//according to the remainder of the entered number divided by 12
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
		//shows the sign
		System.out.println("Çin zodyağı burcunuz:" + zodiac);
	}
		
		}
	

