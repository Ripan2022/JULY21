import java.util.Scanner;

public class UserInputUsingScanner 
{

	public static void main(String[] args) 
  {
		Scanner scobj = new Scanner(System.in);

		System.out.println("Enter First Value : ");
		int firstUserInput = scobj.nextInt();
		System.out.println("Your Input : " + firstUserInput);
		System.out.println("Thanks");
		scobj.close();

	}

}
