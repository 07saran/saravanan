package icici.loans.homeloans;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedMapDemo 
{

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, Integer> h=new LinkedHashMap<Integer, Integer>();
	        h.put(10, 100);
	        h.put(20, 200);
	        h.put(30, 300);
	        h.put(40, 200);
	        h.put(10, 300);
	        System.out.println(h);
	        System.out.println(h.get(20));
	        Set<Integer> keys = h.keySet();
	        for(Integer k:keys)
	        {
	        	System.out.println(k +"--->"+h.get(k));
	        }
	        
	}

}
