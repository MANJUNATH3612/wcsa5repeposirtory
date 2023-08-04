package annonationsandflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Privority_Flag4 {
  @Test(priority = 10)
  public void f() 
  {
	  System.out.println("f");
  }
  
  @Test (priority = 0)
  public void i()
  {
	  System.out.println("i");
  }
  @Test (priority = 1)
  public void j()
  {
	   System.out.println("j");
  }
  
  @Test (priority = 2)
  public void u()
  {
	  System.out.println("u");
  }
  
  @Test (priority = 2)
  public void z()
  {
	  System.out.println("z");
  }
  
  @Test (priority = 3)
  public void q()
  {
	  System.out.println("q");
  }
  @Test (priority = 4)
  public void a()
  {
	  System.out.println("a");
  }
  @Test (priority = 5)
  public void w()
  {
	  System.out.println("w");
  }
  @Test (priority =6)
  public void o()
  {
	  System.out.println("o");
  }
}
