package VendingMachineInventory;

public class Inventory {
	private static int CANDY = 100;
	private static int SNACK = 100;
	private static int NUTS = 100;
	private static int COKE = 100;
	private static int PEPSI = 100;
	
	public static void changeCandy() {
		setCANDY(getCANDY() - 1);
	}
	public static void changeSnack() {
		setSNACK(getSNACK() - 1);
	}
	public static void changeNuts() {
		setNUTS(getNUTS() - 1);
	}
	public static void changeCoke() {
		setCOKE(getCOKE() - 1);
	}
	public static void changePepsi() {
		setPEPSI(getPEPSI() - 1);
	}
	public static int getCANDY() {
		return CANDY;
	}
	public static void setCANDY(int cANDY) {
		CANDY = cANDY;
	}
	public static int getNUTS() {
		return NUTS;
	}
	public static void setNUTS(int nUTS) {
		NUTS = nUTS;
	}
	public static int getPEPSI() {
		return PEPSI;
	}
	public static void setPEPSI(int pEPSI) {
		PEPSI = pEPSI;
	}
	public static int getCOKE() {
		return COKE;
	}
	public static void setCOKE(int cOKE) {
		COKE = cOKE;
	}
	public static int getSNACK() {
		return SNACK;
	}
	public static void setSNACK(int sNACK) {
		SNACK = sNACK;
	}
}
