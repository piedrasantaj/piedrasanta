class LogicalOperators{
	public static void main(String args[]){
		int boy, girl;
		boy = 8;
		girl = 99;
		
		if (boy > 10 || girl <60){	//&& both tests must be true
		// || is the Or symbol
			
			System.out.println("You can enter.");
		}else{
			System.out.println("You can not enter.");
		}
	}
}
