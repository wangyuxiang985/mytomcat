package com.yuxiang.mytomcat;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: yuxiang
 * @Description: 请求封装类
 * @Date: Create in 2018/12/16
 */

public class MyRequest {

    /**
    * url
    */
    private String url;

    /**
    * method
    */
    private String method;

    public MyRequest(InputStream inputStream) throws IOException{

        String httpRequest = "";
        byte[] httpRequestBytes = new byte[1024];
        int length = 0;
        if((length = inputStream.read(httpRequestBytes))>0){
            httpRequest = new String(httpRequestBytes, 0, length);
        }

        //HTTP请求协议
        //GET /favicon.ico HTTP/1.1
        //Accept: */*
        //Accept-Encoding:gzip,deflate
        //User-Agent:Mozilla/5.0(Windows NT 6.1;WOW64;Trident/7.0;rv:11.0) like Gecko
        //Host:localhost:8080
        //Connection:Keep-Alive

        String httpHead = httpRequest.split("\n")[0];
        url = httpHead.split("\\s")[1];
        method = httpHead.split("\\s")[0];
        System.out.println(this);


    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
