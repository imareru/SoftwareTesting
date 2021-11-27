import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.*;

public class StepDef {

    @Given("^I open log in form")
    public void openKpfuRu() {
        $(By.xpath("//*[@id=\"top-panel\"]/div[1]/div[1]/a")).click();

        //open("https://kpfu.ru/");
    }

    /*@When("^press button with text \"([^\"]*)\"$")
    public void press(String button1){
        $(By.xpath("//*[@id=\"top-panel\"]/div[1]/div[1]/a")).click();
    }*/

    @When("^type to input with name \"([^\"]*)\" text: \"([^\"]*)\"$")
    public void typeLogin(String input1, String text1){
        sleep(1000);
        $(By.xpath("//*[@id=\"eu_enter\"]/input[1]")).setValue("RRAkhmetzyanova").click();
    }

    @And("^enter to input with name \"([^\"]*)\" text: \"([^\"]*)\"$")
    public void typePass(String input2, String text2){
        sleep(1000);
        $(By.xpath("//*[@id=\"eu_enter\"]/input[2]")).setValue("ikaz4y6w").click();
    }

    @Then("^press element with text \"([^\"]*)\"$")
    public void pressSend(String button2){
        $(By.xpath("//*[@id=\"eu_enter\"]/input[3]")).click();
    }

    @Given("go to \"([^\"]*)\"$")
    public void goTo(String arg0) {
        $(By.xpath("//*[@id=\"main-blocks\"]/div[1]/div[6]/a")).click();
    }

    @Then("open page \"([^\"]*)\"$")
    public void openPage(String arg0) throws FileNotFoundException {
        $(By.xpath("//*[@id=\"under-slider-menu\"]/div/a[2]")).click();
        $(By.xpath("//*[@id=\"info\"]/div/div[1]/div[2]/div[2]/span[2]"))
                .shouldHave(Condition.exactText("Ахметзянова Рената Рустемовна"));
        /*$(By.xpath("//*[@id=\"info\"]/div/div[1]/div[1]/div[1]")).download();
        sleep(5000);*/
    }

    @Given("go back to main page")
    public void goBackToMainPage() {
    $(By.xpath("//*[@id=\"under-slider-menu\"]/div/a[1]")).click();
    }

    @And("open \"([^\"]*)\"$")
    public void open(String arg0) {
        $(By.xpath("//*[@id=\"main-blocks\"]/div[1]/div[8]/a")).click();
        $(By.xpath("//*[@id=\"under-slider-menu\"]/div/a[8]")).click();
        $(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[1]/a")).click();
    }

    @And("install document")
    public void installDocument() throws FileNotFoundException {
        $(By.xpath("//*[@id=\"tab1\"]/p[3]/a")).click();
        sleep(5000);
    }

    @Then("^press key with text \"([^\"]*)\"$")
    public void pressExit(String button3){
        $(By.xpath("//*[@id=\"page\"]/header/a[1]")).click();
    }
}
//*[@id="tab1"]/p[3]/a/i