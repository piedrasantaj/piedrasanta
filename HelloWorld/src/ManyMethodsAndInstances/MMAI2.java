package ManyMethodsAndInstances;
public class MMAI2{
	private String girlName;	//private limits the use of the variable to that method
	public void setName(String name){
		girlName = name;
	}
	public String getName(){	//String is a return type(Returns value)
		return girlName;
	}
	public void saying(){
		System.out.printf("Your first girlfriends name was %s", getName());	//%s = another string
	}
}