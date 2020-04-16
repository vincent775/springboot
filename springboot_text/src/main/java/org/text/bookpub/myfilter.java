package org.text.bookpub;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import lombok.extern.slf4j.Slf4j;


//过滤器的使用
@Slf4j
public class myfilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException{
               log.info(filterConfig.getFilterName() + " init");
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain){
        log.info("myfilter begin");
        try{
            log.info("业务方法执行");
            String keyword = String.valueOf(request.getParameter(   "keyword"));
            log.info("keyword is "+ keyword);

            chain.doFilter(request,response);
        }
        catch (Exception e){ log.info(" error:"+e);}
        log.info("myfilter end");
    }

//    @Override
//    public void destory(){
//        log.info("destory");
//    }
}
