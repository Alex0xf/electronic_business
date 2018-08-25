package com.javasm.wing.utils;

import javax.servlet.http.HttpServletRequest;

public class IpGetter {
    //获取用户ip工具类,注:0:0:0:0:0:0:0:1是本地,试验了可以拿到
    public static String getLocalIp(HttpServletRequest request) {
        String remoteAddr = request.getRemoteAddr();
        String forwarded = request.getHeader("X-Forwarded-For");
        String realIp = request.getHeader("X-Real-IP");

        String ip = null;
        if (realIp == null) {
            if (forwarded == null) {
                ip = remoteAddr;
            } else {
                ip = remoteAddr + "/" + forwarded.split(",")[0];
            }
        } else {
            if (realIp.equals(forwarded)) {
                ip = realIp;
            } else {
                if(forwarded != null){
                    forwarded = forwarded.split(",")[0];
                }
                ip = realIp + "/" + forwarded;
            }
        }
        return ip;
    }

    //口令有效期功能:数据库也存,每次用redis查校验,
    //不同的员工对应是不同的用户名,根据用户名,查出员工表,角色表,
    //权限验证,日志,
}
