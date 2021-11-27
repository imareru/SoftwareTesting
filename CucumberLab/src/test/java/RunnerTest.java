import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static com.codeborne.selenide.Selenide.open;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/java/features")
public class RunnerTest {

    @BeforeClass
    static public void setupTimeout(){
        Configuration.timeout = 10000;
        System.setProperty("webdriver.chrome.driver", "D://University//3_course//5_semester//SoftwareTesting//CucumberLab//src//chromedriver.exe");
        Configuration.browser = "chrome";
        open("https://kpfu.ru/");
    }
}
