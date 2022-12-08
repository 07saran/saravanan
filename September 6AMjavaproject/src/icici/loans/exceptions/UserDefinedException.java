package icici.loans.exceptions;

import java.util.Scanner;

public class UserDefinedException extends Exception
{

	public UserDefinedException(String string)
	{
	 super(string);
	}
	

	

	public static void main(String[] args)  
	{    String str;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enther the string:");
	     str=sc.nextLine();
		
	     
      while (true)
      { System.out.println("Enther the string:");
	      str=sc.nextLine();
	      
      	 
    	  
    	  try 
    	  {
			if (str.length() != 10)
    	  	
			{
				throw new UserDefinedException("String hould be 10 chars");

			}
			else
				System.out.println(str);
    	        break;
    	  }
    	  
			catch (UserDefinedException e) 
    	  {
			e.printStackTrace();
		} 
      }
	}
	
}