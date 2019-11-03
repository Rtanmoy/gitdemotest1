package p1;
public class PinCheck
{
 public boolean k;
	 public boolean verify(int pinNo)
	{
		switch(pinNo)
		{
			case 1111:k=true;
			break;
			case 2222:k=true;
			break;
			case 3333:k=true;
			break;
			case 4444:k=true;
			break;
			default: k=false;
		}
		return k;
	}
}