/**
 * 
 * @author Sean Hand
 *
 */
public class Task implements Priority
{
	private String name;
	
	private int priority;
	
	enum Status{NOT_STARTED, IN_PROCESS, COMPLETE}

	Status currentStatus;
	
	Task currentTask;
	
	public Task(String s)
	{
		
	}
	
	public int compareTo(Task t)
	{
		Task newTask = this.currentTask;
		
		if(newTask == t)
		{	
		return 0;
		}
		
		else
		return 1;
	}
	
	public String getName()
	{
		return name;
	}
	
	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + ", currentStatus=" + currentStatus + ", getName()="
				+ getName() + ", getStatus()=" + getStatus() + ", getPriority()=" + getPriority() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Status getStatus()
	{
		
		return currentStatus;
	}
	
	public int getPriority()
	{
		return this.priority;
	}
	
	public void setStatus(Status s)
	{
		this.currentStatus = s;
	}
	
	public void setPriority(int p) 
	{
		this.priority = p;
	}
	
	
}
