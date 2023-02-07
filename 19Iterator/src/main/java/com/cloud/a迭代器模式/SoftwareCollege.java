package com.cloud.a迭代器模式;

import java.util.Iterator;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/3
 * @Time 4:42
 */
public class SoftwareCollege implements College {

    Department[] departments;
    int numOfDepartment = 0;

    public SoftwareCollege() {
        departments = new Department[5];
        addDepartment("java", "java");
        addDepartment("php", "php");
        addDepartment("c", "c");
        addDepartment("go", "go");
        addDepartment("vue", "vue");

    }

    @Override
    public String getName() {
        return "软院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new SoftwareCollegeIterator(departments);
    }
}
