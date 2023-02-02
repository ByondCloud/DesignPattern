package com.cloud.b动态代理;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/21
 * @Time 14:53
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach(String say) {
        System.out.println("teaching..." + say);
    }
}
