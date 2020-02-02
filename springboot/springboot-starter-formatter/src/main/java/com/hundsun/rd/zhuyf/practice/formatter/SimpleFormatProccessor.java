package com.hundsun.rd.zhuyf.practice.formatter;

import java.util.Objects;

public class SimpleFormatProccessor implements FormatProccessor {

    @Override
    public <T> String format(T obj) {
        return "StringFormatProccessor:" + Objects.toString(obj);
    }
}
