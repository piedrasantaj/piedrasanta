class SwitchStatement{
	public static void main(String args[]){
		int age;
		age = 7;
		
		switch (age){	//Takes variable and tests it in cases
		case 1:			//if age is 1
			//case is used for performing different actions as well as printing
			System.out.println("You can crawl");
			break;		//if age is 1 end program
		case 2:			//if age is 2
			System.out.println("You can talk!");
			break;		//if age is 2 end program
		case 3:			//if age is 3
			System.out.println("You can get in trouble!");
			break;		//if age is 3 end program
		default:		//if age is unknown
			System.out.println("I dont know how old you are!");
			break;		//if unknown end program
		}
	}
}
