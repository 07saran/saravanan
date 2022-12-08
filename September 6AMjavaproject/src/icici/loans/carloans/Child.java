package icici.loans.carloans;

class Parent
{public void workhard()
	{
	 System.out.println( "Parent:wake up early,go to college");
	 
	}
	
	public void care()
	{
		System.out.println( "Parent:utmost care");
		
	}
}


public class Child extends Parent

{
     public void love()
     {
    	 System.out.println( "child:I love parents");
    	 
     }
	
	
	public static void main(String[] args) 
	{
                 Child obj = new Child();
	              obj.care();
	              
	              obj.love();
	              obj.workhard();
	
	}

}
