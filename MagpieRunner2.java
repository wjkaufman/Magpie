import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();
		
		System.out.println (maggie.getGreeting());
		Scanner kboard = new Scanner (System.in);
		String statement = kboard.nextLine().toLowerCase();
		
		while (!statement.equals("bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = kboard.nextLine().toLowerCase();
		}
	}

}
