package icici.loans.homeloans;

public class Employee 
{
     int eno;
     String ename;
     float esal;
     
     public Employee()
     {System.out.println("i am a default constructor");
     
     }
     
     
     
     
     


	public Employee(String string, int i) 
	{
      
	
	}





	public static void main(String[] args) 
	{
                Employee e1 = new Employee();
                System.out.println(e1.eno);
                System.out.println(e1.ename);
    
                Employee e2 = new Employee("saran",1973);
                System.out.println(e1.eno);
                System.out.println(e2.ename);
                
                

	}

}
