
public class Driver
{

	public static void main(String[] args)
	{		
		PartA();
		PartB();
	}

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
	
	private static void PartB()
	{
		Game g = new Game(200, 100, 500, true);
		int highScore = g.playManyTimes(4);
		System.out.println("High score: " + highScore);
	}

}
