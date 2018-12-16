package com.yuxiang.mytomcat;

/**
 * @Author: yuxiang
 * @Description: Servlet配置类
 * @Date: Create in 2018/12/16
 */
public class ServletMapping {

    /**
    * servletName
    */
    private String servletName;

    /**
    * url
    */
    private String url;

    /**
    * clazz
    */
    private String clazz;

    public ServletMapping() {
    }

    public ServletMapping(String servletName, String url, String clazz) {
        this.servletName = servletName;
        this.url = url;
        this.clazz = clazz;
    }

    public String getServletName() {
        return servletName;
    }

    public void setServletName(String servletName) {
        this.servletName = servletName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
