package com.yuxiang.mytomcat;

import java.io.IOException;

/**
 * @Author: yuxiang
 * @Description: Servlet实现类
 * @Date: Create in 2018/12/16
 */
public class HelloWorldServlet extends MyServlet{
    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("get HelloWorld...");

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) {

        try {
            myResponse.write("post HelloWorld...");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
