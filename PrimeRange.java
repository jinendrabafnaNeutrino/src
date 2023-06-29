package practisecode;
import java.util.Scanner;

public class PrimeRange 
{
	static boolean isprime(int n )
	{
		for(int i = 2 ; i<=n/2;i++)
		{
			if(n %i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for(int i= start ; i<=end;i++)
		{
			if(isprime(i))
			{
				System.out.print(i+" ");
			}
		}
		
	}
}
