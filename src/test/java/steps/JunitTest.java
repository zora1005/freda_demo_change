package steps;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber/cucumber.json",
                "html:target/cucumber", "pretty"},
//        features = {"src/features/SignIn/glipEmailSignIn.feature","src/features/SignIn/acceptE911.feature"},
        features = {"src/test/resources"},
        //features = {"src/features/SignIn/acceptE911.feature"},
        tags = {"@p0"},
        format = {"junit:reports/junit/junit.xml", "html:reports/html"}
        )

public class JunitTest {

}
