package com.hundsun.rd.zhuyf.practice.dubbo.demo.server.impl;

import com.hundsun.rd.zhuyf.practice.dubbo.api.LoginService;

public class LoginServiceImpl implements LoginService {
    @Override
    public boolean login(String userName, String password) {
        if(userName.equals("admin") && password.equals("admin")){
            return true;
        }
        return false;
    }
}
