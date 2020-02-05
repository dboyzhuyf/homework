package com.hundsun.rd.zhuyf.practice.dubbo.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/user")
public interface LoginService {
    @GET
    @Path("/login")
    boolean login(@PathParam("uname")String userName,@PathParam("password") String password);
}
