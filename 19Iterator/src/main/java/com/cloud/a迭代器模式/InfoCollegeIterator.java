package com.cloud.a迭代器模式;

import java.util.Iterator;
import java.util.List;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/3
 * @Time 4:36
 */
public class InfoCollegeIterator implements Iterator {

    List<Department> departments; // 信息工程学院以list方式存放系
    int index = -1; // 索引

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.size() - 1)
            return false;
        index += 1;
        return true;
    }

    @Override
    public Object next() {
        return departments.get(index);
    }

    // 删除方法暂时用不上，空实现
    public void remove() {

    }

}
