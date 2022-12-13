package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PaymentManager 
{
  @Test
  @Parameters({"action"})
  public void makePayment(String ParameterType, ITestContext context) 
  {
    //System.out.println("----------makePayment------");
    if(ParameterType.equals("electronic media"))
        System.out.println("---make payment thorugh electronic media--");
    else
    	System.out.println("---make payment thorugh pay@hotel---");
  
 // Booking Id
    String bookingID= "JSR12345";
    System.out.println("Booking ID:" + bookingID);
    context.setAttribute("bID", bookingID);
  
  }	


  
  @Test

 public void applyDiscount()
{
 System.out.println("-----applyDiscount-----");	

}





}
