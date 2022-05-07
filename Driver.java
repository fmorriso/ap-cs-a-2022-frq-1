/**
 * <b>Purpose:</b> A driver that will run both part A and part B of the FRQ 
 * @author Fred Morrison
 *
 */
public class Driver
{

	public static void main(String[] args)
	{		
		PartA();
		PartB();
	}

	/**
	 * <b>Purpose:</b> runs the four test cases described in Part A of the FRQ
	 */
	private static void PartA()
	{
		Game g = new Game(200, 100, 500, true);
		g.setGameResults(200, 100, 500);
		System.out.println(g);
		
		System.out.println();
		g = new Game(200, 100, 600, false);
		g.setGameResults(200, 100, 500);
		System.out.println(g);
				
		System.out.println();
		g = new Game(200, 200, 500, true);		
		g.setGameResults(200, 100, 500);
		System.out.println(g);
		
		System.out.println();
		g = new Game(300, 100, 500, false);
		g.setGameResults(200, 100, 500);
		System.out.println(g);
		
	}
	
	/**
	 * <b>Purpose:</b> To run Part B of the FRQ
	 */
	private static void PartB()
	{
		Game g = new Game(200, 100, 500, true);
		int highScore = g.playManyTimes(4);
		System.out.println("High score: " + highScore);
	}

}
