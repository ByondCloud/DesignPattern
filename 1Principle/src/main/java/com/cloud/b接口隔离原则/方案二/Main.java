package com.cloud.b接口隔离原则.方案二;

import com.cloud.b接口隔离原则.方案二.impl.B;
import com.cloud.b接口隔离原则.方案二.impl.C;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/11
 * @Time 18:53
 */
public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.operation1();
    }
}
