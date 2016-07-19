package ManyMethodsAndInstances;
import java.util.Scanner;
class MMAI1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		MMAI2 MMAI2Object = new MMAI2();
		
		System.out.println("Enter name of first Girl Friend Here: ");
		String temp = input.nextLine();	//Recieves user input
		MMAI2Object.setName(temp);	//Sets input as girlName variable
		MMAI2Object.saying();
		
		input.close();
	}
}
