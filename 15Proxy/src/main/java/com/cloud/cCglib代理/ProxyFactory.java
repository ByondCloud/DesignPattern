package com.cloud.cCglib代理;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/21
 * @Time 15:51
 */
public class ProxyFactory implements MethodInterceptor {

    // 需要被代理的类
    private Object target;

    // 通过构造器传入
    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 通过动态代理获取代理对象的过程
    public Object getProxyInstance() {
        // 创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建子类
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理模式");
        Object returnVal = method.invoke(target, objects);
        return returnVal;
    }
}
