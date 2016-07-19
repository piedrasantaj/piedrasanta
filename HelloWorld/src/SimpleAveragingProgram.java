import java.util.Scanner;

class SimpleAveragingProgram{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int total = 0;	//Holds the sum of all the grades
		int grade;		//input individual numbers
		int average;	//used to average numbers
		int counter = 0;//Breaks while loop
		
		while (counter < 10){
			grade = input.nextInt();	//assigns number to grade until changed
			total = total + grade;		//TN = TO + Gd
			counter++;
		}
		average = total/10;				//finds average of all 10 numbers
		System.out.println("Your average is " + average);
		
		input.close();
	}
}
