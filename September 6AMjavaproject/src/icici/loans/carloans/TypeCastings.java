package icici.loans.carloans;

public class TypeCastings 
{
    //Type casting from one primitive type to another primitive type  
	
	public static void main(String[] args) 
	{
         int x1=10;
         System.out.println(x1);
        int x2=x1;
        System.out.println(x2);
        
        double y1= 12.34;
        System.out.println(y1);
        int y2=(int) y1;
        System.out.println(y2);
        
        //Type casting from one primitive type to corresponding wapper class type  
        
        int i1=100;
        System.out.println(i1);
        Integer i2=100;
        i2=i1;
        System.out.println(i2);
       // i2=Integer.valueOf(i1);
        
        Integer k1=10;
        System.out.println(k1);
        
        int k2=10;
        //int k2=(k1);
         k2 = (int) k1;

        System.out.println(k2);
        
        //Type casting from one wapper class to another wapper class type  
        
        String s1= "100";
        String s2= "200";
        
        System.out.println(s1+s2);
        
        i1 =Integer.parseInt(s1);
        i2=Integer.parseInt(s2);
        System.out.println(i1+i2);
        
       float f1 = Float.parseFloat(s1);
       float f2 = Float.parseFloat(s2);
       System.out.println(f1+f2);
        


         
	}

}
