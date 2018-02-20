package com.blueberry.springboot.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author hekai
 * @create 2018-02-20-10:27
 */
@Component
public class LogTest {

    private Logger LOG = LoggerFactory.getLogger(LogTest.class);

    public void testLog(){
        LOG.info("testLog info");
        LOG.debug("testLog debug");
        LOG.warn("testLog warn");
        LOG.error("testLog error");
    }
}
