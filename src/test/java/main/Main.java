package main;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Feature.feature", plugin = {
		"json:src/test/resources/cucumber-report/Resultado.json", "junit:src/test/resources/junit-report/Resultado.xml",
		"html:src/test/resources/cucumber-report/" }, glue = {
		"" }, tags = {"@Teste4"}, monochrome = true, dryRun = false, strict = false)

public class Main {

}