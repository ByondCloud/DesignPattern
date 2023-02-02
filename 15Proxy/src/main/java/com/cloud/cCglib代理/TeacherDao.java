package com.cloud.cCglib代理;

import com.cloud.a静态代理.ITeacherDao;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/21
 * @Time 13:35
 */
public class TeacherDao {

    public String teach() {
        System.out.println("teaching...");
        return "hello";
    }
}
