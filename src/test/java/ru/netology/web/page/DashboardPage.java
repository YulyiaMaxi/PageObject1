package ru.netology.web.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ru.netology.web.data.DataHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DashboardPage {
  private SelenideElement heading = $("[data-test-id=dashboard]");

  private final ElementsCollection cards = $$(".list__item div");

  public DashboardPage() {
    heading.shouldBe(visible);
  }

  public int getCardBalance(DataHelper.CardInfo cardInfo) {
    var text = cards.findBy(Condition.text(cardInfo.getCardNumber().substring(15))).getText();
    return extractBalance(text);
  }

  private int extractBalance(String text) {
    return extractBalance(text);
  }

  public void selectCardToTransfer(DataHelper.CardInfo cardInfo) {
  }
}








