/**
 * This program prints out the words to a rhyme used 
 * by children to select someone
 *
 */
public class Potatoes
{
	/**
	 * The sequence of instructions that should 
	 * execute when we run the program
	 * 
	 */
	public static void main(String[] args)
	{
		int potatoNumber;
		
		potatoNumber = 1;
		while (potatoNumber<8)
		{
			System.out.print(potatoNumber);
			if (potatoNumber != 4)
			{
				System.out.print("potato");
			}
			System.out.println("");
			
			potatoNumber = potatoNumber + 1;
			
		}
		System.out.println("More");
		System.out.println("You're out!");
	}
}
