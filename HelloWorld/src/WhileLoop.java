class WhileLoop{
	public static void main(String args[]){
		int counter = 0;
		
		while (counter < 10){	//will not break untill counter = 10
			//loop will continue
			System.out.println(counter);
			counter++;	//adding 1 for every loop stops the loop at 10
		}
	}
}
