import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Your challenge is to read in a price
		System.out.println("Enter a price");
		double price = in.nextDouble();
		//Read in the amount paid
		System.out.println("How much was paid");
		double paid = in.nextDouble();
		//Print out the amount of change
		double change = paid - price;
		System.out.println("Your change is $"+change);
		//Break the change into all denominations: 
		//$100,$50,$20,$10,$5,$2,$1,$0.25,$0.10,$0.05
		//As a bonus, make your project round to the nearest $0.05 like actual stores.
		int num100 = (int)( change/100);
		System.out.println("you get "+num100+" x $100");
		change = change-num100*100;
		int num50 = (int)( change/50);
		System.out.println("you get "+num50+" x $50");
		change = change-num50*50;
		int num20 = (int)( change/20);
		System.out.println("you get "+num20+" x $20");
		change = change-num20*20;
		int num10 = (int)( change/10);
		System.out.println("you get "+num10+" x $10");
		change = change-num10*10;
		int num5 = (int)( change/5);
		System.out.println("you get "+num5+" x $5");
		change = change-num5*5;
		int num2 = (int)( change/2);
		System.out.println("you get "+num50+" x $2");
		change = change-num2*2;
		int num0_25 = (int)( change/0_25);
		System.out.println("you get "+num0_25+" x $0_25");
		change = change-num0_25*0_25;
		int num0_10 = (int)( change/0_10);
		System.out.println("you get "+num0_10+" x $0_10");
		change = change-num0_10*0_10;
		int num0_05 = (int)( change/0_05);
		System.out.println("you get "+num0_05+" x $0_05");
		change = change-num0_05*0_05;
	
		
	}
}
        