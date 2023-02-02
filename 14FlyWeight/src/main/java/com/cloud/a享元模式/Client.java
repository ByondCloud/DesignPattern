package com.cloud.a享元模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/21
 * @Time 11:45
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个工厂类
        WebSiteFactory webSiteFactory = new WebSiteFactory();


        // 客户要一个以新闻形式的网站
        WebSite news = webSiteFactory.getWebSite("news");
        news.use(new User("tom"));

        // 客户需要以博客形式的网站
        WebSite blog = webSiteFactory.getWebSite("blog");
        blog.use(new User("jack"));

        WebSite news2 = webSiteFactory.getWebSite("news");
        news2.use(new User("kk"));

        System.out.println(webSiteFactory.getWebSiteCount());

    }
}
