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
	
	/**
	 * Gets the current number of points earned for this level
	 * 
	 * @return = the number of points earned so far.
	 */
	public int getPoints()
	{
		return currentPoints;
	}
	
	/**
	 * Sets the current number of points for this level to the specified value.
	 * 
	 * @param n - the new value to replace the current number of points.
	 */
	public void setPoints(int n)
	{
		currentPoints = n;		
	}
}
