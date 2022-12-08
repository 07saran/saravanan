package icici.loans.carloans;

public class StringDemo {

	private static char[] s;

	public static void main(String[] args) 
	{
		String s1="saravanan";
		System.out.println(s1);
		
		String s2=new String("saran");
		System.out.println(s2);
		
	    System.out.println(s1.length());
	    System.out.println(s1.isEmpty());
	    System.out.println(s1.charAt(6));
	    System.out.println(s1.indexOf("n"));
	    
	    String s3="Saravanan";
	    System.out.println(s1);
	    System.out.println(s2);
	    System.out.println(s1.equals(s3));
	    System.out.println(s1.equalsIgnoreCase(s3));
	    
	    String s4="Sara";
	    System.out.println(s1);
	    System.out.println(s4);
	    System.out.println(s1.contains(s4));
	    
	    System.out.println(s1.toLowerCase());
	    System.out.println(s1.toUpperCase());
	    System.out.println(s1+s4);
	    System.out.println(s1.startsWith("sara"));	    
	    System.out.println(s1.endsWith("ana"));
	    System.out.println(s1);
	    System.out.println(s1.substring(2,9));
	    
	    String s5=  " Saravanan";
	    System.out.println(s1);
	    System.out.println(s5);
	    System.out.println(s5.trim());
	    System.out.println(s1.equals(s5));
	    System.out.println(s1.equalsIgnoreCase(s5));
	    System.out.println(s1.equalsIgnoreCase(s5.trim()));
	    
	    String s6= "Sara Vana Krish";
	    System.out.println(s6);
	    String[] str = s6.split(" ");
	    for(String s:str)
	    {
	    	System.out.println(s);
	    }
	    
	    
	    
	}

	
}
