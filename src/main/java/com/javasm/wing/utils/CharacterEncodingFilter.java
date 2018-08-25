package com.javasm.wing.utils;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter {
    protected String encoding = null;
    protected String resType = null;
    protected FilterConfig filterConfig = null;
    protected boolean ignore = true;

    @Override
    public void destroy() {
        // 销毁所有全局变量的值,设为null
        this.encoding = null;
        this.filterConfig = null;
        this.resType = null;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain filterChain) throws IOException, ServletException {
        // 从web.xml中得到过滤器的字符串编码
        if (ignore || (request.getCharacterEncoding() == null)) {
            if (encoding != null) {
                request.setCharacterEncoding(encoding);
                response.setCharacterEncoding(encoding);
                response.setContentType(resType);
            }

        }
        filterChain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
        this.encoding = filterConfig.getInitParameter("encoding");
        this.resType = filterConfig.getInitParameter("resType") == null ? "text/html; charset=utf-8"
                : filterConfig.getInitParameter("resType");
        String value = filterConfig.getInitParameter("ignore");
        if (value == null)
            this.ignore = true;
        else if (value.equalsIgnoreCase("true"))
            this.ignore = true;
        else
            this.ignore = false;
    }


}
