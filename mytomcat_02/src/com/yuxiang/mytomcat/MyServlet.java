package com.yuxiang.mytomcat;

/**
 * @Author: yuxiang
 * @Description: Servlet请求处理基类
 * @Date: Create in 2018/12/16
 */
public abstract class MyServlet {

    public abstract void doGet(MyRequest myRequest, MyResponse myResponse);

    public abstract void doPost(MyRequest myRequest, MyResponse myResponse);

    public void service (MyRequest myRequest,MyResponse myResponse){

        if(myRequest.getMethod().equalsIgnoreCase("POST")){
            doPost(myRequest,myResponse);
        }else if(myRequest.getMethod().equalsIgnoreCase("GET")){
            doGet(myRequest,myResponse);
        }

    }
}
