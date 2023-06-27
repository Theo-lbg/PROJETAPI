package com.projetapi.lebegue.projetapi;

import com.intuit.karate.junit5.Karate;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(Karate.class) @CucumberOptions(
//		features ="src/test/resources/composant",
//		glue = {"com.projetapi.lebegue.projetapi"},
//		format={"pretty","html:target/cucumber"},
//		dryRun = true,
//		strict = true,
//		monochrome = true )
class ProjetapiApplicationTests {

	@Karate.Test
	Karate testTags() {
		return Karate.run("classpath:PROJETAPI/src/test/resources/composant").tags("@second").relativeTo(getClass());
	}
}
