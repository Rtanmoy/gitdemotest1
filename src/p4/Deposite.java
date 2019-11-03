
package p4;
import p3.Transaction;
public class Deposite implements Transaction
{
public void process(double amt)
	{
	        System.out.println("Amount Deposite:"+amt);
			b1.bal=b1.bal+amt;
			b1.getBal();
			System.out.println("Transaction completed");		
    }
}