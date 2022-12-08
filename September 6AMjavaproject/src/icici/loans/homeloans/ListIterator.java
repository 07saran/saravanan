package icici.loans.homeloans;

import java.util.ArrayList;

public class ListIterator 
{

	private static java.util.ListIterator<String> val;

	public static void main(String[] args) 
	{
          ArrayList<String> a = new ArrayList<String>();
          a.add("Truist");
          a.add("hcl");     
          a.add("Bpl");
          a.add("cvs");
          a.add("tcl");
          System.out.println(a);	
          java.util.ListIterator<String> val= a.listIterator();
          
          while (val.hasNext())
        	  {
        	         String var = val.next();
        	         if(var.equals("cvs"))
        	         val.set("cary on");
        	         else
        	        	 val.remove();
        	                	  
        	  }
	          System.out.println(a); 
	}  

}
