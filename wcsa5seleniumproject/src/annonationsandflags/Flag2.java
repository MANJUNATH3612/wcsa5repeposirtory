package annonationsandflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(description = "login method!!", enabled = true)
  public void method1()
  {
	  
	 Reporter.log("this is method1",true);
	 
	  
  }
  
  @Test(description="logout",enabled=true)
  public void method2()
  {
	  Reporter.log("this is the method2",true);
  }
}
