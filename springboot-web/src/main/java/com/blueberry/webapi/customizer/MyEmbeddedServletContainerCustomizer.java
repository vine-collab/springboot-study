package com.blueberry.webapi.customizer;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.stereotype.Component;

/**
 * @author hekai
 * @create 2018-02-17-14:46
 */
@Component
public class MyEmbeddedServletContainerCustomizer implements EmbeddedServletContainerCustomizer {

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {

        TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory = (TomcatEmbeddedServletContainerFactory) container;
        tomcatEmbeddedServletContainerFactory.setPort(10009);
        tomcatEmbeddedServletContainerFactory.addConnectorCustomizers(new MyTomcatConnectorCustomizer());
    }


}


class MyTomcatConnectorCustomizer implements TomcatConnectorCustomizer{

    @Override
    public void customize(Connector connector) {
        Http11NioProtocol protocolHandler = (Http11NioProtocol) connector.getProtocolHandler();
        protocolHandler.setMaxConnections(2000);
        protocolHandler.setPollerThreadCount(500);
    }
}

