package buyStuff;

import VendingMachineInventory.Balance;
import VendingMachineInventory.Buy;
import VendingMachineInventory.CostPrice;
import VendingMachineInventory.Inventory;

public class buyPepsi implements Buy {

	@Override
	public void buyStuff(Balance balance) {
		// TODO Auto-generated method stub
		if(balance.sum<CostPrice.PepsiCost) {
			System.out.println("Sorry You Do Not Have Sufficient Balance :((((");
		}
		else {
			balance.fifteen -= 1;
			balance.twenty -= 1;
			System.out.println("Transaction was succesful!!!!");
			System.out.println("Your Current Balance is:"+ balance.calcSum());
			Inventory.changePepsi();
		}
		
	}

}
