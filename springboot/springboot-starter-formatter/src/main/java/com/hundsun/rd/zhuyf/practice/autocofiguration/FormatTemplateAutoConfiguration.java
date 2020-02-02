package com.hundsun.rd.zhuyf.practice.autocofiguration;

import com.hundsun.rd.zhuyf.practice.HelloFormatterTemplate;
import com.hundsun.rd.zhuyf.practice.formatter.FormatProccessor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(FormatAutoConfiguration.class)
@EnableConfigurationProperties(HelloProperties.class)
@Configuration
public class FormatTemplateAutoConfiguration {

    @Bean
    public HelloFormatterTemplate helloFormatterTemplate(HelloProperties helloProperties,FormatProccessor formatProccessor){
        return new HelloFormatterTemplate(helloProperties,formatProccessor);
    }
}
