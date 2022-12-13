package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class CustomerCommunication 
{
  private static final String bookID = null;

@Test
  public void checkEmailVerification (ITestContext context) 
  {  String bookID = (String)context.getAttribute("bID");
    System.out.println("----checkEmailVerification---:" +bookID);
   
  }

  @Test
   public void checkMobileVerification(ITestContext context) 
   {
	   String bookID = (String)context.getAttribute("bID");
	   System.out.println("----checkMobileVerification----"+ bookID);
   }



}
