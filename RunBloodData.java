import java.util.Scanner;
public class RunBloodData{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		String bt,rh;
		
		System.out.print("Enter blood type of patient:");
		String input1 =scan.nextLine();
		System.out.print("Enter the Rhesus factor (+ or -):");
		String input2 =scan.nextLine();
		
		if(input1.isEmpty()){
			if(input2.isEmpty()){
				BloodData bd = new BloodData();
				bd.Display();
			}
			else{
				System.out.print("Sorry Invalid");
			}
		}
		else if (input1.equals("A")||input1.equals("B")||input1.equals("O")||input1.equals("AB")){
			if(input2.equals("+")||input2.equals("-")){
				BloodData bd = new BloodData(input1,input2);
				bd.Display();
			}
			else{
				System.out.print("Sorry Invalid");
			}
		}
		else if (input1.equals("A")||input1.equals("B")||input1.equals("O")||input1.equals("AB")){
			if(input2.equals("+")||input2.equals("-")){
				BloodData bd = new BloodData();
				bd.Display();
			}
			else{
				System.out.print("Sorry Invalid");
			}
			
		}else{
			System.out.print("Sorry Invalid");
		}
	}
}
