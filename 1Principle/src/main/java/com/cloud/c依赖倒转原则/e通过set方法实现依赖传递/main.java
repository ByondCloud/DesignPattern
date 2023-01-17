package com.cloud.c依赖倒转原则.e通过set方法实现依赖传递;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/13
 * @Time 23:44
 */
public class main {
    public static void main(String[] args) {

    }

}

interface IOpenAndClose {
    void open();
    void setTV(ITV tv);
}

interface ITV {
    void play();
}


class OpenAndClose implements IOpenAndClose {

    private ITV tv;

    @Override
    public void open() {
        this.tv.play();
    }

    @Override
    public void setTV(ITV tv) {
        this.tv = tv;
    }
}
