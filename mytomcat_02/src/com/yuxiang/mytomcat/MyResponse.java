package com.yuxiang.mytomcat;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @Author: yuxiang
 * @Description:相应对象
 * @Date: Create in 2018/12/16
 */
public class MyResponse {

    /**
    * outputStream
    */
    private OutputStream outputStream;

    public MyResponse(OutputStream outputStream){
        this.outputStream = outputStream;
    }

    public void write(String content) throws IOException{

        //HTTP响应协议
        //HTTP/1.1 200 OK
        //Content-Type: text/html
        //<html><body></body></html>

        StringBuffer httpResponse = new StringBuffer();
        httpResponse.append("HTTP/1.1 200 OK\n")
                .append("Content-Type: text/html\n")
                .append("\r\n")
                .append("<html><body>")
                .append("</body></html>");

        outputStream.write(httpResponse.toString().getBytes());
        outputStream.close();

    }

    public OutputStream getOutputStream() {
        return outputStream;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
    }
}
