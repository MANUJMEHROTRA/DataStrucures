
public class HelloWorld
{

	public static void main(String[] args){

		System.out.println("Hello World My First java program");
		int factb = fact(6);
		System.out.println("The Fact of 6 is " + factb);
	}

	static public int fact(int a){
		if (a <= 1){
			return 1;
		}
		else{
			return a*fact(a-1);
		}
	}
}