package qa.guru.allure;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LabelsTest {

    private static final String REPOSITORY = "eroshenkoam/allure-example";
    private static final int PR_NUMBER = 91;

    @Test
    @Feature("Issue в репозитории")
    @Story("Создание Issue")
    @Owner("Blinki4")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "Blinki4", url = "https://Blinki4.github.com")
    @DisplayName("Создание Issue для авторизованного пользователя")
    public void testStaticLabels() {

    }

    @Test
    public void testSDynamicLabels() {

    }
}
