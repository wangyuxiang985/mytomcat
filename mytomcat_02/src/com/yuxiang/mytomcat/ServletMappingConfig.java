package com.yuxiang.mytomcat;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author: yuxiang
 * @Description: Servlet配置类
 * @Date: Create in 2018/12/16
 */
public class ServletMappingConfig {

    public static List<ServletMapping> servletMappingList = new CopyOnWriteArrayList<>();

    static {
        servletMappingList.add(new ServletMapping("findGirl", "/girl", "com.yuxiang.mytomcat.FindGirlServlet"));
        servletMappingList.add(new ServletMapping("helloWorld", "/world", "com.yuxiang.mytomcat.HelloWorldServlet"));
    }

}
