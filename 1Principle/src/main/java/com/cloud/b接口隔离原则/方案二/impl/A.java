package com.cloud.b接口隔离原则.方案二.impl;

import com.cloud.b接口隔离原则.方案二.Interface.Interface1;
import com.cloud.b接口隔离原则.方案二.Interface.Interface23;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/11
 * @Time 18:49
 */
public class A implements Interface1, Interface23 {

    @Override
    public void operation1() {

    }

    @Override
    public void operation2() {

    }

    @Override
    public void operation3() {

    }
}
