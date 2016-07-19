import java.util.Scanner;
class BasicCalculator{
	public static void main(String args[]){
		Scanner bobert = new Scanner(System.in);
		double fnum, snum, answer;	//stating multiple variables in the same line
		System.out.println("Enter First Number: ");
		fnum = bobert.nextDouble();	//First variable input
		System.out.println("Enter Second Number: ");
		snum = bobert.nextDouble();	//Second variable input
		answer = fnum + snum;	//Adds variables
		System.out.println(answer);
		
		bobert.close();
		return;
	}
}