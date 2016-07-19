import java.util.Scanner;	// imports Scanner
class GettingUserInput{
	public static void main(String args[]){
		Scanner bucky = new Scanner(System.in);	//Keybord or user input
		System.out.println(bucky.nextLine());	//prints Variabe
		
		bucky.close();
		return;
	}
}