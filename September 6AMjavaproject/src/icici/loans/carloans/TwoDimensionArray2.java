package icici.loans.carloans;

public class TwoDimensionArray2 
{

	public static void main(String[] args) 
	{
      int[][]a= new int[4][4];
      
      a[0][0]=10;
      a[0][1]=20;
      a[0][2]=30;
      
      a[1][0]=40;
      a[1][1]=50;
      a[1][2]=60;
      
      a[2][0]=70;
      a[2][1]=80;
      a[2][2]=90;
      
      a[3][0]=100;
      a[3][1]=110;
      a[3][2]=120;
      
      
      
      for(int i=0;i<4;i++)
      {
          	  for(int j=0;j<3;j++)
    	      {
    		    System.out.print(a[i][j]+"  "); 
    	      }
    	      System.out.println();
     
	}
      
	}	

}
