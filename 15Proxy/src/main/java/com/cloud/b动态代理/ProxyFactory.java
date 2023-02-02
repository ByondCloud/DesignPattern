package com.cloud.b动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/21
 * @Time 14:54
 */
public class ProxyFactory {

    // 维护一个需要被代理的对象
    private Object target;

    // 通过构造器传入需要被代理的对象
    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 给需要被代理的对象生成一个代理对象
    public Object getProxyInstance() {

        // loader: 指定当前目标对象使用的类加载器，获取加载器的方法是固定的
        // interfaces: 需要被代理的对象 实现的接口类型，使用泛型的方式确认类型
        // h: 事件处理，执行目标对象方法时，会触发事件处理器的方法，会把当前执行的目标对象方法做为一个参数传入
//        return Proxy.newProxyInstance(loader, interfaces, h) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    // 第一个参数proxy，是代理对象的信息，可以getClass看看，具体可以参考
                    // https://blog.csdn.net/bu2_int/article/details/60150319#
                    // 第二个参数method，像这里就是main方法中proxyInstance.teach("abc") 的teach方法，就是method
                    // 第三个args，就是method的参数，比如上面的方法，args就是"abc"
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始");
                        // 反射机制调用目标对象的方法
                        Object returnVal = method.invoke(target, args);
                        return returnVal;
                    }
                });
    }
}
