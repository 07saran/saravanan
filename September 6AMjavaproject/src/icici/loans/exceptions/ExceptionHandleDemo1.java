package icici.loans.exceptions;

import java.util.Scanner;

public class ExceptionHandleDemo1 
{

	public static void main(String[] args)
	{
		//int nr= 100, dr= 0,result;
		//result=nr/dr;
		
		//System.out.println(result);
		int nr, dr, result;
		Scanner sc = new Scanner(System.in);

		while (true) 
			
		{System.out.println("Enter the nr value");
		nr = sc.nextInt();
		System.out.println("Enter the dr valu");
		dr = sc.nextInt();
			try 
			{ result=nr/dr;
			 System.out.println(result);
			 break;
				
			} 
			catch (Exception e) 
			{

				e.printStackTrace();
			}
		}
		
				
		
		
	}

}
