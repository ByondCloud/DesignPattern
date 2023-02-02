package com.cloud.cCglib代理;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/21
 * @Time 16:01
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(new TeacherDao()).getProxyInstance();
        String teach = proxyInstance.teach();
        System.out.println(teach);
    }
}
