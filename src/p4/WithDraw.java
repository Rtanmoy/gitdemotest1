package p4;
import p3.Transaction;
public class WithDraw implements Transaction
{
public void process(double amt)
	{
		if(amt<=b1.bal)
		{
			System.out.println("Amount Withdraw:"+amt);
			b1.bal=b1.bal-amt;
			b1.getBal();
			System.out.println("Transaction completed");
			
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
		
}