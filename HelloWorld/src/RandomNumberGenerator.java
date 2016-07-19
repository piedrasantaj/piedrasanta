import java.util.Random;	//Imports Random

class RandomNumberGenerator{
	public static void main(String[] args){
		Random dice = new Random();
		int number;
		
		for (int counter = 1; counter <= 10; counter++){
			number = 1+dice.nextInt(6);		//random numbers from 1-6
			System.out.println(number);
		}
	}
}
