package com.cloud.b接口隔离原则.方案二.impl;

import com.cloud.b接口隔离原则.方案二.Interface.Interface1;
import com.cloud.b接口隔离原则.方案二.Interface.Interface45;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/11
 * @Time 18:51
 */
public class C implements Interface1, Interface45 {

    @Override
    public void operation1() {

    }

    @Override
    public void operation4() {

    }

    @Override
    public void operation5() {

    }
}
