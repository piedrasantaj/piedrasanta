import java.util.Scanner;
class MathOperators{
	public static void main(String args[]){
		Scanner Robert = new Scanner(System.in);
		
		int girls, boys, people;	//if using division use double
		girls = 6;
		boys = 3;
		people = girls + boys;	//can replace + with / - %(Modules/remainder) or *
		System.out.println(people);
		
		Robert.close();
		return;
	}
}