package TestScripts;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
/* I have used cucumber , junit, maven and selenium
 * Need to run this test runner file to check the functionality of login page 
 * Here in this Cucumber project i have created different packages as follows
 * 1.Pages --> this package works as the objects Repository 
 * 2.StepDefinition--> here all the step definitions of feature file are created
 * 3.TestScripts--> here i kept the runner class using which we can check the whole functionality
 * 4.Feature Folder--> folder is created to store the feature file
 * 5.Reports Folder--> folder is created to store the reports 
 * 6.Resources Folder-->folder is created to store all the required dependencies 
 * 7.We can integrate these dependencies in POM.XML also 
 * 
 * 
 * Note:- need to change the path of chromedriver 
 */
@RunWith(Cucumber.class)
@CucumberOptions(
	features="Feature",
	glue="stepDefinition",
	monochrome=true,
	plugin= {"pretty","json:Reports/login.json"}
		)
public class TestRunner {

}
