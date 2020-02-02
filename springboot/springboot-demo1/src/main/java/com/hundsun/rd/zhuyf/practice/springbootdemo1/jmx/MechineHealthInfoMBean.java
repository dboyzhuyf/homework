package com.hundsun.rd.zhuyf.practice.springbootdemo1.jmx;

public interface MechineHealthInfoMBean {

    int getCpuCore();

    long getFreeMemory();

    void shutdown();
}
