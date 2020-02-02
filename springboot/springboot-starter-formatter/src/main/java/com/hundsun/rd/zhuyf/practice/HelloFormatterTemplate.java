package com.hundsun.rd.zhuyf.practice;

import com.hundsun.rd.zhuyf.practice.autocofiguration.HelloProperties;
import com.hundsun.rd.zhuyf.practice.formatter.FormatProccessor;

public class HelloFormatterTemplate {

    private FormatProccessor formatter;
    private HelloProperties helloProperties;

    public HelloFormatterTemplate(HelloProperties helloProperties,FormatProccessor formatter){
        this.helloProperties = helloProperties;
        this.formatter = formatter;
    }

    public <T> String doFormat(T obj){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Execute formatter:").append("<br />");
        stringBuilder.append("HelloProperties:").append(formatter.format(helloProperties.getInfo())).append("<br/>");
        stringBuilder.append("Obj format result:").append(formatter.format(obj)).append("\r\n");
        return stringBuilder.toString();
    }
}
