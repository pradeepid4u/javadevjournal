package com.javadevjournal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Log4J2Controller {

    private static final Logger LOG = LogManager.getLogger(Log4J2Controller.class);

    @GetMapping(value = "/greeting")
    public String greeting() {
        String spi = "1234123412341234";
        LOG.error("1234123412341234 Debugging log in our greeting method",spi);
        LOG.info("1234123412341234 Info log in our greeting method pradeep@wellsfargo.com 121212341");
        LOG.warn("Warning log in our greeting method 1234123412341234");
        LOG.error("Error in our greeting method 1234123412341234");
        return "Hello!!!";
    }
}
