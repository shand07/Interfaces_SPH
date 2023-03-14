/**
 * 
 * @author Sean Hand
 * This is the process class, includes are a few variables and methods
 *
 */
public class Process implements Priority
{

	private String processID;
	
	private int priority;
	
	public Process(String p)
	{
		
	}
	
	public int compareTo(Process p)
	{
		Process newProcess = new Process("");
		
		if(newProcess == p)
		{
			return 0;
		}
		
		else 
		return 1;
	}
	
	public void setPriority(int p)
	{
		this.priority = p;
	}
	
	public String getProcessID()
	{
		return processID;
	}
	
	public int getPriority()
	{
		return this.priority;
	}
	
}
