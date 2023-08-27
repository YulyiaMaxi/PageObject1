package ru.netology.web.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.web.data.DataHelper;

import ru.netology.web.page.DashboardPage;
import ru.netology.web.page.VerificationPage;

import ru.netology.web.page.LoginPage;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.netology.web.data.DataHelper.generateInvalidAmount;
import static ru.netology.web.data.DataHelper.generateValidAmount;
class MoneyTransferTest {
    DashboardPage dashboardPage; //если экземпляр класса используется не однократно, но лучше прописать его сразу в классе

    @Test //BeforeEach
        // в предусловии выполняется часть сценария
    void setup() { // не забываем про метод setup, который устанавливает следующую логику шагов        
        open("http://localhost:9999");
        var loginPage = new LoginPage();
        var authInfo = DataHelper.getAuthInfo(); // получаем данные авторизации
        var verificationPage = loginPage.validLogin(authInfo);//вставляем данные авторизации
        var verificationCode = DataHelper.getVerificationCodeFor(authInfo); // получаем код верификации
        dashboardPage = verificationPage.validVerify(verificationCode); //здесь не пишем var, тк мы создаем сущность, которую используем не единожды, а var для конкретного единого объекта
    }
    // выполняем верификацию и переходим в ЛК
// в результате работы validVerify возвращается новый объект страницы VerificationPage - новый dashboardpage, которы  мы сохраняем в переменную dashboardpage

}
