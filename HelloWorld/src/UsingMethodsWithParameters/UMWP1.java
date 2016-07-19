package UsingMethodsWithParameters;
import java.util.Scanner;	//Calls on scanner
class UMWP1{
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);		//Creates inputs
		UMWP2 UMWP2Object = new UMWP2();			//puts variable into memory for 2nd class
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();				//Scanner outputs input to variable name
		
		UMWP2Object.simpleMessage(name);			//2nd class is executed
		
		input.close();		//Closes variable(Not written in video program)
	}
}
