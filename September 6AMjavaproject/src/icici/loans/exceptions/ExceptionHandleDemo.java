package icici.loans.exceptions;

import java.util.Scanner;

public class ExceptionHandleDemo 
{

	public static void main(String[] args) 
	{
         int nr, dr, result;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the nr value:");
         nr=sc.nextInt();
         System.out.println("Enter the dr value:");
         dr=sc.nextInt();
         
         
       // ArithmeticException e = new ArithmeticException();
        
         
         while (true) 
         {   System.out.println("Enter the nr value:");
             nr=sc.nextInt();
             System.out.println("Enter the dr value:");
             dr=sc.nextInt();
			try 
			
			{
				result = nr / dr;
				System.out.println(result);
				break;
			}
			catch (ArithmeticException e) 
			{
				e.printStackTrace();
			} 
		
         
         
	
         
	    finally
	
	    {
        	System.out.println("I am from final block...");
        }
         }   
	}      
}
