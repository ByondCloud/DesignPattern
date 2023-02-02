package com.cloud.a模板方法模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/30
 * @Time 0:01
 */
public abstract class SoyaMilk {
    // 模板方法
    // 可以将方法做成final，防止子类重写
    final void make() {
        select();
        // 这里就是对应下面的钩子方法所做出的改变
        if (customerWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }

    // 黄豆
    void select() {
        System.out.println("选择黄豆");
    }

    // 添加配料，因为不知道要做什么口味的豆浆，所以让子类实现
    abstract void addCondiments();

    //浸泡
    void soak() {
        System.out.println("浸泡黄豆和配料");
    }

    void beat() {
        System.out.println("放入豆浆机");
    }

    // 我们添加一个方法，判断是否需要添加配料
    // 默认为true，如果某个子类不需要添加配料，那么就重写该方法
    boolean customerWantCondiments() {
        return true;
    }
}
