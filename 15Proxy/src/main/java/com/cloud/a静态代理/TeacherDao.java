package com.cloud.a静态代理;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/21
 * @Time 13:35
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("teaching...");
    }
}
