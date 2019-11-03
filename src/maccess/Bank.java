package maccess;
import java.util.Scanner;

import p1.PinCheck;
import p4.*;
public class Bank
{
public static void main(String[] args) 
	{ 
	    int count=0;
		Scanner s=new Scanner(System.in);
		xyz:
		while(true)
		{
         System.out.println("Enter PinNo:");
		 String p=s.nextLine();
	 if(p.length()==4)
		{
			 PinCheck pc=new PinCheck();
			 boolean z=pc.verify(Integer.parseInt(p));
			 if(z)
			{
        System.out.println("...CHOICE.....");
		System.out.println("1.WithDraw\n2.Payment\n3.Deposite");
		System.out.println("Choice Enter: ");
		int choice=Integer.parseInt(s.nextLine());

	     switch(choice)
		  {
			case 1:
		
		    WithDraw wd=new WithDraw();
		    System.out.println("Enter the amount:");
		    int amt=Integer.parseInt(s.nextLine());
		    if(amt>0 && amt%100==0)
		    {
		      wd.process(amt);
		    }else{ System.out.println("Enter Invalid Amount");}
		   break xyz; 
			
		   case 2:
		   Payment pt=new Payment();
		   System.out.println("Enter the amount:");
		   float amt1=Float.parseFloat(s.nextLine());
		 if(amt1>0)
		  {
		    pt.process(amt1);
		  }else
			{System.out.println("Invalid amount");}

		   break xyz;

		   case 3:
	         Deposite dt=new Deposite();
	         System.out.println("Enter the amount:");
		     int amt3=Integer.parseInt(s.nextLine());
		  if(amt3>0 && amt3%100==0)
		   {
		     dt.process(amt3);
		   }
		   else
			{ System.out.println("Invalid choice");}
		    break xyz;

		    default:System.out.println("Invalid amount");
		   }//end of switch
		 }
		else{ System.out.println("Wrong pin Enter");
		count ++;} 
		if(count==3)
		{
		System.out.println("sorry,Trnsaction Block");
		break xyz;
		}
	    }
		}//end of if
	 } //end if
  }//end of main