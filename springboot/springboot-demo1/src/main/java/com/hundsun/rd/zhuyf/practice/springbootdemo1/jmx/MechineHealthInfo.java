package com.hundsun.rd.zhuyf.practice.springbootdemo1.jmx;

public class MechineHealthInfo implements MechineHealthInfoMBean {
    @Override
    public int getCpuCore() {
        return Runtime.getRuntime().availableProcessors();
    }

    @Override
    public long getFreeMemory() {
        return Runtime.getRuntime().freeMemory();
    }

    @Override
    public void shutdown() {
        System.exit(0);
    }
}
