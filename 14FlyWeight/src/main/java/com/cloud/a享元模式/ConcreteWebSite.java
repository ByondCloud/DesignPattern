package com.cloud.a享元模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/21
 * @Time 11:25
 */
public class ConcreteWebSite extends WebSite {

    private String type = null; // 网站的类型


    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为：" + type);
        System.out.println("使用者为：" + user.getName());
    }
}
