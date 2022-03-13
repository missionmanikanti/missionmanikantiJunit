package gluecode;

import java.util.List;
import java.util.Map;

import org.manikanti.swsolutions.Junit.pages.GooglePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class StepDef2 {
		public Shared sh;
		
		//Dependancy injection via constructor
		public StepDef2(Shared x)
		{
			sh=x;
		}

		@When("i entered a value and verify title")
		public void method4(DataTable dt) throws Exception
		{
			//Take data from DataTable
			List<Map<String,String>> l=dt.asMaps();
			for(int i=0; i<l.size(); i++)
			{
				//Click on Compose
				sh.obj.fillSearchBoxAndClickEnter(l.get(i).get("word"));
				if(sh.obj.verifyTitle(sh.driver, l.get(i).get("word")))
				{
					sh.s.log("Test passed");
				}
				else
				{
					sh.s.log("Test failed");
				}
				sh.driver.navigate().back();
			}
		}
	@When("close site")
	public void close_site() 
	{
		sh.driver.close();
	}

}
