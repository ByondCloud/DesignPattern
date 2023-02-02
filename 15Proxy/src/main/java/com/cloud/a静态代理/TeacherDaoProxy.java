package com.cloud.a静态代理;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/21
 * @Time 13:36
 */
// 代理对象，静态代理
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target; // 目标对象，通过接口聚合

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理开始");
        target.teach();
        System.out.println("代理结束");
    }
}
