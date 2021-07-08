package Driver;

import java.util.Scanner;

import VendingMachineInventory.Balance;
import VendingMachineInventory.Inventory;
import buyStuff.buyPepsi;
import buyStuff.buySnacks;

public class User {
	
	public static void main(String[]args) {
		Inventory inventory = new Inventory();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the number of 5 cents you have");
		int five = sc.nextInt();
		System.out.println("Please Enter the number of 10 cents you have");
		int ten = sc.nextInt();
		System.out.println("Please Enter the number of 15 cents you have");
		int fifteen = sc.nextInt();
		System.out.println("Please Enter the number of 20 cents you have");
		int twenty = sc.nextInt();
		
		Balance balance = new Balance(five,ten,fifteen,twenty);
		balance.calcSum();
		balance.displayBalance();
		
		System.out.println("Welcome to the Vending Machine!!!We Have The Following Choices For You"
				+ "1.Snacks"
				+ "2.Coke"
				+ "3.Pepsi"
				+ "4.Nuts"
				+ "5.Candy"
				+ "6.Soda");
		
		while(true) {
			int choice = sc.nextInt();
			sc.nextLine();
			String ch;
			switch(choice) {
			
			case 1: System.out.println("Snacks Cost 10 Dollars. Do You Wish To Continue?Y/N");
					 ch = sc.nextLine();
					if(ch.equals("N")) {
						System.out.println("The Transaction was Cancelled :((. Your Balance is: "+balance.calcSum());
						return;
						
					}
					if(Inventory.getSNACK()<= 0) {
						System.out.println("Sorry We Are Out Of Snacks");
						break;
					}
					buySnacks obj = new buySnacks();
					obj.buyStuff(balance);
					
					System.out.println("The Amount Of Snack Bars Left :"+ Inventory.getSNACK());
					break;
			case 2:System.out.println("Pepsi Costs 35 Dollars. Do You Wish To Continue?Y/N");
				    ch = sc.nextLine();
				   if(ch.equals("N")) {
					   System.out.println("The Transaction was Cancelled :((. Your Balance is: "+balance.calcSum());
					   return;
						
					}
				   if(Inventory.getPEPSI()  <= 0) {
					   System.out.println("Sorry We Are Out Of Pepsi");
					   break;
				   }
				   buyPepsi obj2 = new buyPepsi();
				   obj2.buyStuff(balance);
					
				   System.out.println("The Amount Of Snack Bars Left :"+ Inventory.getPEPSI());
				   break;
			
			
					
					
			}
			System.out.println("Do you Want To Continue?Y/N");
			String n = sc.nextLine();
			if(n.equals("N")) {
				break;
			}
			
			
		}
		

		
		
		
		
	}
}
