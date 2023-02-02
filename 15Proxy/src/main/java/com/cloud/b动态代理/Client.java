package com.cloud.b动态代理;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/21
 * @Time 15:05
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao target = new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        proxyInstance.teach("abc");
    }
}
