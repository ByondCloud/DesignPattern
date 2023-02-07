package com.cloud.a迭代器模式;

import java.util.Iterator;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/3
 * @Time 4:40
 */
public interface College {
    //获取学院名称
    public String getName();

    // 增加系
    public void addDepartment(String name, String desc);

    // 返回一个迭代器
    public Iterator createIterator();

}
