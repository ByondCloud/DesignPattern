package com.cloud.a方案一;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 12:17
 */
public abstract class Phone {

    // 组合品牌
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        brand.open();
    }

    protected void close() {
        brand.close();
    }

    protected void call() {
        brand.call();
    }
}
