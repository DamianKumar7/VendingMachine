package Driver;

import VendingMachineInventory.Inventory;

public class InventoryUsage {
	public static void StuffLeft(){
		Inventory.getSNACK();
		Inventory.getCANDY();
		Inventory.getCOKE();
		Inventory.getNUTS();
	}
}
