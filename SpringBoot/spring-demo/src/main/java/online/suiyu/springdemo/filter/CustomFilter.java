package online.suiyu.springdemo.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "customFilter", urlPatterns = {"/"})
public class CustomFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger("CustomFilter.class");

    @Override
    public void init(FilterConfig filterConfig) {
        logger.info("CustomFilter过滤器启动");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // TODO 过滤器主要工作区
        logger.info("doFilter 请求处理");
        //对request、response进行一些预处理
        // 比如设置请求编码
        // request.setCharacterEncoding("UTF-8");
        // response.setCharacterEncoding("UTF-8");
        // TODO 进行业务逻辑

        //链路 直接传给下一个过滤器
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        logger.info("CustomFilter过滤器删除");
    }
}
