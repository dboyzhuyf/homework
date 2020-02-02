package com.hundsun.rd.zhuyf.practice.springbootdemo1;

import com.hundsun.rd.zhuyf.practice.springbootdemo1.jmx.MechineHealthInfo;
import com.hundsun.rd.zhuyf.practice.springbootdemo1.jmx.MechineHealthInfoMBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

import javax.management.*;
import java.lang.management.ManagementFactory;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class
})
public class SpringbootDemo1Application {

    public static void main(String[] args) throws NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, MalformedObjectNameException {

        SpringApplication.run(SpringbootDemo1Application.class, args);
        MBeanServer beanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName on = new ObjectName("com.hundsun.rd.zhuyf.practice.springbootdemo1.jmx.MechineHealthInfo:type=mechine");
        MechineHealthInfoMBean mechineHealthInfoMBean = new MechineHealthInfo();
        beanServer.registerMBean(mechineHealthInfoMBean,on);
    }

}
