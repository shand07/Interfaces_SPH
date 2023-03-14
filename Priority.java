/**
 * 
 * @author Sean Hand
 * 
 * Data and Methods for Priority
 *
 */
public interface Priority 
{
	final int MED_PRIORITY = 5;
	
	final int MIN_PRIORITY = 1;
	
	final int MAX_PRIORITY = 10;
	
	public void setPriority(int i);
	
	public int getPriority();
}