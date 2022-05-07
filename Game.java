/**
 * Purpose: Implement the Game class as defined in the 2022 AP CSA FRQ #1
 * 
 * @author Frederick Morrison
 *
 */
public class Game
{
	private Level levelOne;
	private Level levelTwo;
	private Level levelThree;
	private boolean isBonus;

	/**
	 * <b>PostCondition:</b> All instances variables have been initialized.
	 */
	public Game()
	{
		this(10, 50, 100, false);
	}

	public Game(int levelOneThreshold, int levelTwoThreshold, int levelThreeThreshold, boolean isBonusGame)
	{
		levelOne = new Level(levelOneThreshold);
		levelTwo = new Level(levelTwoThreshold);
		levelThree = new Level(levelThreeThreshold);
		isBonus = isBonusGame;
	}

	/**
	 * 
	 * @return <code>true</code> if this game is a bonus game and returns false otherwise;
	 */
	public boolean isBonus()
	{
		return isBonus;
	}

	/**
	 * Simulates the play of this <code>Game</code> (consisting of three levels) and updates all relevant game data.
	 */
	public void play()
	{
		levelOne.setPoints(getRandomPoints());
		levelTwo.setPoints(getRandomPoints());
		levelThree.setPoints(getRandomPoints());
	}

	private int getRandomPoints()
	{
		final int MIN = 100, MAX = 500, RANGE = MAX - MIN + 1;
		return (int) (Math.random() * RANGE) + MIN;
	}

	/**
	 * 
	 * <b>Purpose:</b> Simulates the play of <code>num</code> games and returns the highest game score earned. For example, if the four plays of the game that are simulated as a result of the method
	 * <code>playManyTimes(4)</code> earn scores of 75, 50, 90 and 20, the the method should return 90.
	 * <p>
	 * Play of the game is simulated by calling the helper method <code>play</code>. Note that if <code>play</code> is called only one time followed by multiple consecutive calls to
	 * <code>getScore</code>, each call to <code>getScore</code> will return the score earned in the single simulated play of the game.
	 * <p>
	 * <b>Precondition:</b> <code>num</code> > 0.
	 * 
	 * @param num
	 *            - the number of times to play the game.
	 * @return - the highest score.
	 * 
	 */
	public int playManyTimes(int num)
	{
		int highScore = Integer.MIN_VALUE;
		for (int i = 0; i < num; i++)
		{
			play();
			int score = getScore();
			highScore = Math.max(highScore, score);
		}
		return highScore;
	}

	/**
	 * 
	 * @return the score earned in the most recently played game.
	 * @implSpec The score for the game is computed asccording to the following rules:
	 *           <ul>
	 *           <li>Level one points are earned only if the level one goal is reached.
	 *           <li>Level two points are earned only if both the level one and level two goals are reached.
	 *           <li>Level three points are earned only if the goals of all three levels are reached.
	 *           <li>The score for the game is the sum of the points earned for levels one, two, and three.
	 *           <li>If the game is a bonus game, the score for the game is tripled.
	 *           </ul>
	 */
	public int getScore()
	{
		int score = 0;
		if (levelOne.goalReached())
		{
			score += levelOne.getPoints();
			if (levelTwo.goalReached())
			{
				score += levelTwo.getPoints();
				if (levelThree.goalReached())
				{
					score += levelThree.getPoints();
				}
			}
		}

		if (isBonus())
		{
			score *= 3;
		}

		return score;
	}

	public String toString()
	{
		String val = "";
		val += String.format("Level 1 goalReached: %b, getPoints: %d %n", levelOne.goalReached(), levelOne.getPoints());
		val += String.format("Level 2 goalReached: %b, getPoints: %d %n", levelTwo.goalReached(), levelTwo.getPoints());
		val += String.format("Level 3 goalReached: %b, getPoints: %d %n", levelThree.goalReached(), levelThree.getPoints(), isBonus());
		val += String.format("isBonus: %b %n", isBonus);
		val += String.format("Score calculation: %d", getScore());
		return val;
	}

	public void setGameResults(int one, int two, int three)
	{
		levelOne.setPoints(one);
		levelTwo.setPoints(two);
		levelThree.setPoints(three);
	}

	public void setBonus(boolean isBonusGame)
	{
		isBonus = isBonusGame;		
	}
}
