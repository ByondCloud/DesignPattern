package com.cloud.a组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 16:03
 */
public class University extends OrganizationComponent {

    // 这个list中存放的是学院
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public University(String name, String age) {
        super(name, age);
    }


    @Override
    protected void add(OrganizationComponent organizationComponent) {
        // 将来实际业务中，添加和删除方法需要自己去做
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    //  输出学校包含的学院
    @Override
    protected void print() {
        System.out.println("------------" + getName() + "------------");
        // 遍历list
        organizationComponents.forEach(OrganizationComponent::print);
    }
}
