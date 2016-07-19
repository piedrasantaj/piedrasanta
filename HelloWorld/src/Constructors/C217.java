package Constructors;
public class C217{
	private String girlName;
	
	public C217(String name){	//Constructor
	//used for making multiple instances in main class
		girlName = name;
	}
	
	public void setName(String name){	//new method used to create a variable
		girlName = name;
	}
	public String getName(){			//new method used to reassign variable
		return girlName;
	}
	public void saying(){				//new method used to print the message
		System.out.printf("Your first gf was %s\n", getName());
	}
}
