package Basicprogram;
import java.util.Scanner;
public class prime 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner primeNo = new Scanner(System.in);
		System.out.println("Enter no to check prime or not");
		int n=primeNo.nextInt();
		boolean isPrime=true;
		for (int i=2; i<n; i++)
		{
			if(n % i==0)
			{   
				isPrime=false;				
				break;
			}			
		}
		
		if(isPrime==false)
		{
			System.out.println("Given no is not prime: ");
		}
		else
		{
			System.out.println("Given no is  prime: " );
		}
				    		
	}
}
