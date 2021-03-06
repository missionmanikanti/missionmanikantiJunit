package tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature/myfeature.feature", 
                 glue="gluecode",
                 plugin={"pretty","html:target/myresults"},
                 monochrome=true)
public class MyRunner
{
}
