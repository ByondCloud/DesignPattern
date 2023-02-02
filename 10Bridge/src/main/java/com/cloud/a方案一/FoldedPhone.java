package com.cloud.a方案一;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 12:19
 */
public class FoldedPhone extends Phone{

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
    }

    @Override
    protected void close() {
        super.close();
    }

    @Override
    protected void call() {
        super.call();
    }
}
