package com.cloud.a้ๆไปฃ็;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/21
 * @Time 13:41
 */
public class Client {
    public static void main(String[] args) {
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(new TeacherDao());
        teacherDaoProxy.teach();
    }
}
