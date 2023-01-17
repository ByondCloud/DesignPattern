package com.cloud.c依赖倒转原则.d构造方法的依赖传递;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/13
 * @Time 23:28
 */
public class main {
}


interface IOpenAndClose {
    void open();
}

interface ITV {
    void play();
}


class OpenAndClose implements IOpenAndClose {

    public ITV tv;

    public OpenAndClose(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}

