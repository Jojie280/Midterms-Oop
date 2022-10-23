public class BloodData{
	public static void main(String [] args){
	}
	static String bloodType;
	static String rhFactor;
	public BloodData()
	{
		this.bloodType= "O";
		this.rhFactor =	"+";
	}
	public BloodData(String bt,String rh)
	{
		this.bloodType=bt;
		this.rhFactor=rh;
	}
	public void Display(){
		System.out.print(bloodType+rhFactor+" is added to the blood bank.");
	}
}