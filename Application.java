/**
 * 
 * @author Sean Hand
 *
 */
public class Application 
{

	public static void main(String[] args) 
	{
		/**
		 * Testing for Rational Number methods
		 */
		
		
		RationalNumber R1 = new RationalNumber(1,2);
		
		RationalNumber R2 = new RationalNumber(2,3);
		
		System.out.println(R1.compareTo(R2));
		
		
		/**
		 * Testing for Task Methods
		 */
		
		
		Task T1 = new Task("finished");
		
		Task T2 = new Task("next");
		
		T1.setPriority(0);
		
		T2.setPriority(1);
		
		System.out.println("Priority Level is: " +T1.getPriority());
		
		T1.setStatus(Task.Status.COMPLETE);
		
		T2.setStatus(Task.Status.NOT_STARTED);
		
		System.out.println("The Status of T1 is: " +T1.getStatus());
		
		
		System.out.println("If the following is a 1 they are not the same: " +T1.compareTo(T2));
		
		/**
		 * Testing for Process Methods
		 */
		
		
		Process P1 = new Process("first");
		
		Process P2 = new Process("second");
		
		System.out.println("If these processes are not the same a 1 will be printed: " +P1.compareTo(P2));
		
		P1.setPriority(1);
		
		System.out.println("The Priority Level is: " +P1.getPriority());
		
		Process ProcessID = new Process("");
		
		System.out.println("The ProcessID is: " +ProcessID.getProcessID());
		
		
	}

}
