package gluecode;

import org.manikanti.swsolutions.Junit.pages.GooglePage;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Shared 
{
	//declare common objects as static(gets commonly sharable memory for all child classes)
	public  RemoteWebDriver driver;
	public  GooglePage obj;
	public  Scenario s;
	
	@Before
	public void method1(Scenario x )
	{
		s=x;		//Define scenario object to a scenario, which is coming into execution
	}
	
	
}
