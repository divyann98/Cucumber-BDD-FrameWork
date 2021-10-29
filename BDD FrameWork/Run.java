package Cucumber.CucumberFrameWork;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/Login.feature" , glue = {"Cucumber.CucumberFrameWork"})
public class Run {

}
