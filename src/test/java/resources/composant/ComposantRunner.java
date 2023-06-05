package resources.composant;

import com.intuit.karate.junit5.Karate;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class) @CucumberOptions(
        features ="src/test/resources/composant")
class ComposantRunner {

    @Karate.Test
    Karate testQuotes() {
        return Karate.run("composant").relativeTo(getClass());
    }
}