package com.cloud.a迭代器模式;

import java.util.Iterator;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/3
 * @Time 4:31
 */
public class SoftwareCollegeIterator implements Iterator {

    // 这里我们需要知道Department是以怎样的方式存放
    Department[] departments;
    int position = 0;

    public SoftwareCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
//        if (position >= departments.length || departments[position] == null)
//            return false;
//        return true;

        return position < departments.length && departments[position] != null;
    }

    @Override
    public Object next() {
        Department department  = departments[position];
        position += 1;
        return department;
    }

    // 删除方法暂时用不上，空实现
    public void remove() {

    }

}
