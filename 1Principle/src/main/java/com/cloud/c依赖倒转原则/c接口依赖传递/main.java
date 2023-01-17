package com.cloud.c依赖倒转原则.c接口依赖传递;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/13
 * @Time 22:41
 */
public class main {
    public static void main(String[] args) {

    }
}

interface IOpenAndClose {
    void open(ITV tv);
}

interface ITV {
    void play();
}


class OpenAndClose implements IOpenAndClose {

    @Override
    public void open(ITV tv) {
        tv.play();
    }
}

