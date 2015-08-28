package org.openqa.selenium.phantomjs;

import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import static org.junit.Assert.*;

/**
 *
 */
public class PhantomJSDriverTest {

    @Rule
    public HttpServer httpd = new HttpServer();

    @Test
    public void experimental() {
        DesiredCapabilities capabilities = DesiredCapabilities.phantomjs();
        PhantomJSDriverService driverService = new PhantomJSDriverService.Builder()
                .build();


        PhantomJSDriver phantom = new PhantomJSDriver(driverService, capabilities);
        EventFiringWebDriver driver = new EventFiringWebDriver(phantom);

    }

}