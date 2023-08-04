package annonationsandflags;

import org.testng.annotations.Test;

public class dependancy_Flag5 {
  @Test 
  public void loginmehod() 
  {
	  System.out.println("it is use to perform login!!");
  }
  
  @Test (dependsOnMethods = "loginmehod")
  public void createUserMethod() 
  {

	  System.out.println("it is use to perform create user !!");
  }
  
  @Test (dependsOnMethods = "createUserMethod")
  public void logoutMethod() 
  {

	  System.out.println("it is use to perform logout!!");
  }
}
