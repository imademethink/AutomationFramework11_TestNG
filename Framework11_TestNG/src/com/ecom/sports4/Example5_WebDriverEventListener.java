package com.ecom.sports4;
import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Example5_WebDriverEventListener {
    HtmlUnitDriver driver                              = null;
    EventFiringWebDriver eventHandler                  = null;
    MyWebDriverEventListener myWebDriverEventListener = null;

    @Test
    public void T1_Navigate(){
        System.out.println("T1_Navigate");
        java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);
        driver = new HtmlUnitDriver(false);
        eventHandler              = new EventFiringWebDriver(driver);
        myWebDriverEventListener = new MyWebDriverEventListener();
        eventHandler.register(myWebDriverEventListener);
        eventHandler.get("https://github.com/");
        eventHandler.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void T2_SearchGithub(){
        System.out.println("T2_SearchGithub");
        eventHandler.findElement(By.cssSelector("a[href*='login']")).click();
        eventHandler.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void T3_Close(){
        System.out.println("T3_Close");
        eventHandler.quit();
        eventHandler.unregister(myWebDriverEventListener);
    }

}
