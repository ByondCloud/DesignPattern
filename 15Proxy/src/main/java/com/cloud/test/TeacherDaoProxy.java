package com.cloud.test;



/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/21
 * @Time 13:36
 */
// 代理对象，静态代理
public class TeacherDaoProxy {

    private TeacherDao target; // 目标对象，通过接口聚合

    public TeacherDaoProxy(TeacherDao target) {
        this.target = target;
    }

    public void teach() {
        System.out.println("代理开始");
        target.teach();
        System.out.println("代理结束");
    }
}
