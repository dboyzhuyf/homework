package com.hundsun.rd.zhuyf.practice.formatter;

import com.alibaba.fastjson.JSON;

public class JsonFormatProccessor implements FormatProccessor {

    @Override
    public <T> String format(T obj) {
        return "JsonFormatProcessor:" + JSON.toJSONString(obj);
    }
}
