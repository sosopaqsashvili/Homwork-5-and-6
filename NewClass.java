package NewPackaje;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import com.sun.source.tree.AssertTree;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.*;

public class NewClass {
   @Test
    public void test() {
        open("https://www.facebook.com/");
        String str = "სოსო";
        SelenideElement nameInput = $(By.name("email"));
        nameInput.setValue(str);
        Assert.assertEquals(nameInput.getValue(),str,"massage");
        Assert.assertFalse(nameInput.is(Condition.empty),"message");
        $(new ByText("Create new account")).click();
        $(new By.ByName("firstname")).setValue("სოსო").click();
        $(By.name("lastname")).setValue("პაქსაშვილი").click();
        $(By.name("reg_email__")).setValue("soso.paqsashvili2@gmail.com").click();
        sleep(4000);
        $(By.name("reg_email_confirmation__")).setValue("soso.paqsashvili2@gmail.com").click();
        $(By.name("reg_passwd__")).setValue("SOSO123").click();
        $("#month").selectOption("Aug");
        $("#day").selectOption("3");
        $("#year").selectOption("1996");
        $(new ByText("Custom")).click();
        $(new ByText("preferred_pronoun")).shouldBe(Condition.disappear);
        $(new ByText("_83kf")).shouldBe(Condition.disappear);
        //$("#js_5s2").selectOption("He: \"Wish him a happy birthday!\"");
        $(By.name("custom_gender")).setValue("Male").click();
        $(new ByText("Male")).click();
        $(new ByText("Male")).shouldBe(Condition.visible, Duration.ofMillis(3000));
    }
}
