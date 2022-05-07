/**
 * Purpose: Implement the Level class as defined in the 2022 AP CSA FRQ #1
 * @author Frederick Morrison
 *
 */
public class Level
{
	private int pointsThreshold;
	private int currentPoints;
	/**
	 * Returns {@code true} if the player reached the goal on this level and returns {@code false} otherwise
	 */
	public boolean goalReached()
	{
		return currentPoints >= pointsThreshold;
	}
	/**
	 * @param pointsThreshold - the minimum number of points needed to reach this level.
	 */
	public Level(int pointsNeeded)
	{		
		pointsThreshold = pointsNeeded;
		currentPoints = 0;
	}
	
	public int getPoints()
	{
		return currentPoints;
	}
	
	public void setPoints(int n)
	{
		currentPoints = n;		
	}
}
