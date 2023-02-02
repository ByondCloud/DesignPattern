package com.cloud.a组合模式;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 16:14
 */
public class Department extends OrganizationComponent {


    public Department(String name, String age) {
        super(name, age);
    }

    // 因为专业是整个体系中的叶子节点，就不需要add和remove方法了

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
