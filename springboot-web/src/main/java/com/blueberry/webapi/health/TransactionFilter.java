package com.blueberry.webapi.health;

import com.blueberry.webapi.RequestWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;

//@Component
//@Order(1)
public class TransactionFilter implements Filter {

    private Logger LOG = LoggerFactory.getLogger(TransactionFilter.class);


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain) throws IOException, ServletException {

        Map<String, String[]> parameterMap = request.getParameterMap();
        request = new RequestWrapper((HttpServletRequest) request);
        BufferedReader reader = request.getReader();
        Map<String, String[]> requestParams = request.getParameterMap();
        System.out.println("-------requestParams:" + requestParams);
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println("-------line:" + line);
        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }

    // other methods 
}
