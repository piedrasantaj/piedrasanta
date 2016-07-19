import java.util.Scanner;
class IncrementOperators{
	public static void main(String args[]){
		Scanner Gobert = new Scanner(System.in);
		
		int trout = 5;
		int bass = 18;
		System.out.println(++trout);	//++ can be replaced with --
		System.out.println(trout);
		System.out.println(trout++);	//++ can be replaced with --
		System.out.println(trout);
		
		trout = trout + 5;	//+ can be replaced with / - % or *
		System.out.println(trout);
		
		trout += 8;	//+ can be replaced with -  or *
		System.out.println(trout);
		System.out.println(bass);
		
		Gobert.close();
		return;
	}
}