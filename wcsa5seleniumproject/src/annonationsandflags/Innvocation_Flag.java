package annonationsandflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Innvocation_Flag {
  @Test(invocationCount = 10)
  public void method1() 
  {
	  Reporter.log("this is method 1",true);
  }
}
