package com.yuxiang.mytomcat;

import java.io.IOException;

/**
 * @Author: yuxiang
 * @Description: Servlet实现类
 * @Date: Create in 2018/12/16
 */
public class FindGirlServlet extends MyServlet{
    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("get girl...");

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) {

        try {
            myResponse.write("post girl...");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
