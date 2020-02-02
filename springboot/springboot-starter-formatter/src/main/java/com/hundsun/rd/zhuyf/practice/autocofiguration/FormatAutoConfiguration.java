package com.hundsun.rd.zhuyf.practice.autocofiguration;

import com.hundsun.rd.zhuyf.practice.formatter.FormatProccessor;
import com.hundsun.rd.zhuyf.practice.formatter.JsonFormatProccessor;
import com.hundsun.rd.zhuyf.practice.formatter.SimpleFormatProccessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class FormatAutoConfiguration {

    @ConditionalOnMissingClass("com.alibaba.fastjson.JSON")
    @Bean
    @Primary
    public FormatProccessor simpleFormatter(){
        return new SimpleFormatProccessor();
    }

    @ConditionalOnClass(name = "com.alibaba.fastjson.JSON")
    @Bean
    public FormatProccessor jsonFormat(){
        return new JsonFormatProccessor();
    }
}
