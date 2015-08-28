package org.openqa.selenium.phantomjs;

import fi.iki.elonen.NanoHTTPD;
import org.junit.rules.ExternalResource;

import java.io.IOException;

/**
 *
 */
public class HttpServer extends ExternalResource {

    private NanoHTTPD httpd;

    @Override
    protected void before() throws Throwable {
        httpd = new NanoHTTPD(12345) {

        };

    }

    @Override
    protected void after() {
        httpd.stop();
    }

}
