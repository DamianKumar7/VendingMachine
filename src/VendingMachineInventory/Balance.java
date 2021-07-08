package VendingMachineInventory;

public class Balance {
	public int five;
	public int ten;
	public int fifteen;
	public int twenty;
	public int sum;
	public Balance(int five,int ten,int fifteen,int twenty){
		this.five = five;
		this.ten = ten;
		this.fifteen = fifteen;
		this.twenty = twenty;

	
	}
	public void displayBalance() {
		
		System.out.println("Your Balance is:"+sum);
	}
	public int calcSum() {
		sum = five+ten+fifteen+twenty;
		return sum;
	}
	
}
