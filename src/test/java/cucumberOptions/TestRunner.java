package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "src/test/java/features",
	    glue="stepDefinations")
public class TestRunner extends AbstractTestNGCucumberTests  {   // runner file converted to TestNg from Junit by
	                      //   extending AbstractTestNGCucumberTests

}


/* in order to run cucmber wit testng
 * 1>convert junit runner to testngRunner,jar needed is cucumber-testng copy it in POM.XML
 
  2> extend AbstractTestNGCucumberTest into TestRunner.
  3>in the testng cucumber xml give the test runner file(create a new testng file)
  4>in the pom file <configuration> provide the testng file, ie inside mavensure fire plugin.
  5>
*/