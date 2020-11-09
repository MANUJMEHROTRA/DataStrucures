import java.util.Scanner;

public class TakingUserInput{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String name = s.nextLine();
		System.out.println("Enter your Age: ");
		int age = s.nextInt();
		System.out.println("Enter your Salary: ");
		float salary = s.nextFloat();
		System.out.println("Enter your Gender: ");
		char gender = s.next().charAt(0);
		System.out.println("Your deatils are as follows "+name+age+salary+gender);


	}
}