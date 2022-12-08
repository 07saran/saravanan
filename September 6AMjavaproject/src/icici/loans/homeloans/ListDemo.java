package icici.loans.homeloans;

import java.util.ArrayList;

public class ListDemo 
{

	public static void main(String[] args) 
	
	{
            ArrayList a= new ArrayList();
            
            a.add(10);
            a.add("Saran");
            a.add(12.3);
            a.add(10.05f);
            a.add(10);
            System.out.println(a);
            a.add("java");
            System.out.println(a);;
            System.out.println(a.indexOf("saran"));
            System.out.println(a);
            System.out.println( a.get(1));
            a.add(1, "cars");
            System.out.println(a);
            a.clear();
            System.out.println(a);
            
            a.remove("cars");
            System.out.println(a);
            a.addAll(a);
            System.out.println(a);
	}

}
