package qa.guru.allure;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    @Step("Открываем главную страницу")
    public void openMainPage() {
        open("https://github.com");
    }

    @Step("Ищем репозиторий {repository}")
    public void searchForRepository(String repository) {
        $("[placeholder='Search or jump to...']").click();
        $("#query-builder-test").sendKeys(repository);
        $("#query-builder-test").submit();
    }

    @Step("Кликаем по ссылке репозитория {repository}")
    public void clickOnRepositoryLink(String repository) {
        $(By.linkText(repository)).click();
    }

    @Step("Открываем таб pull-request")
    public void openPullRequestsTab() {
        $("#pull-requests-tab").click();

    }

    @Step("Проверяем номер пул реквеста {pullRequest}")
    public void shouldBePullRequestWithNumber(int pullRequest) {
        $(".opened-by").shouldHave(text("#" + pullRequest));
    }

    @Attachment(value = "Screenshot", type = "image/png", fileExtension = "png")
    public byte[] takeScreenshot() {
        return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
