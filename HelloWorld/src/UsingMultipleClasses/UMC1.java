package UsingMultipleClasses;	//Defines where the file is located
//This is the main method
class UMC1{
	public static void main(String[] args){
		
		UMC2 UMC2Object = new UMC2();	//Creates new object
		UMC2Object.simpleMessage();		//Calls on another class
	}
}
