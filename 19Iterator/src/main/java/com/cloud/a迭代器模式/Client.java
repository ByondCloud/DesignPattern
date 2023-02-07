package com.cloud.a迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/3
 * @Time 4:57
 */
public class Client {
    public static void main(String[] args) {
        // 创建学院
        List<College> colleges = new ArrayList<>();
        colleges.add(new SoftwareCollege());
        colleges.add(new InfoCollege());

        OutPutImpl outPut = new OutPutImpl(colleges);
        outPut.printCollege();

    }
}
