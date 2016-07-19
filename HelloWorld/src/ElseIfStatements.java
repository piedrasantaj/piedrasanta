class ElseIfStatements{
	public static void main(String args[]){
		int age = 45;
		
		if (age >= 60){
			System.out.println("Your a senior citizen.");
		}
		//Presents another if statement that is more specified or different
		else if (age >= 50){	//can be made multiple times
			System.out.println("You are in your 50's.");
		}
		else if (age >= 40){
			System.out.println("You are in your 40's.");
		}
		else{
			System.out.println("You are a young buck.");
		}
	}
}
