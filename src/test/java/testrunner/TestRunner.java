package testrunner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features = "src/test/resources/Features/OnlineMovieRental.feature",
		glue = "steps",
		plugin = {"pretty","html:target/cucumber-repots"}
)

public class TestRunner {

	
}
