package com.cloud.a组合模式;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 15:59
 */
@Data
@AllArgsConstructor
public abstract class OrganizationComponent {

    private String name;
    private String age;

    protected void add(OrganizationComponent organizationComponent) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    // print方法
    protected abstract void print();
}
