package com.cloud.a组合模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 16:16
 */
public class Client {
    public static void main(String[] args) {
        // 从大到小的去创建
        // 创建学校
        OrganizationComponent university = new University("闽江学院", "闽院");
        // 创建学院
        OrganizationComponent college1 = new College("软件学院", "软院");
        OrganizationComponent college2 = new College("数学与数据科学学院", "数科");
        // 创建专业
        OrganizationComponent department1 = new Department("软件工程", "软工");
        OrganizationComponent department2 = new Department("VR技术", "VR");
        OrganizationComponent department3 = new Department("数据科学", "数科");
        OrganizationComponent department4 = new Department("大数据技术", "大数据");

        // 给学院添加专业
        college1.add(department1);
        college1.add(department2);
        college2.add(department3);
        college2.add(department4);

        // 给学校添加学院
        university.add(college1);
        university.add(college2);

        university.print();
    }
}
