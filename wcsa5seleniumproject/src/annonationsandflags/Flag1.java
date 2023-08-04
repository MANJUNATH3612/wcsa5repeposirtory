package annonationsandflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	  @Test(description = "login metho1")
	  public void method1() 
	  {
		  Reporter.log("method 1 from flag1");
	  }
	  
	  public class Flag2 {
		  @Test(description = "logout metho1")
		  public void method1() 
		  {
			  Reporter.log("method 2 from flag1");
		  }
	}
}
