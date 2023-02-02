package com.cloud.e深拷贝方式二;

import lombok.SneakyThrows;

import java.io.*;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/19
 * @Time 10:30
 */
public class SheepPen implements Serializable, Cloneable {

    public String name;
    public Sheep sheep;

    public SheepPen(String name) {
        this.name = name;
    }

    // 深拷贝实现
    @SneakyThrows
    @Override
    protected Object clone() throws CloneNotSupportedException {

        // 序列化操作
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this); // 当前对象以对象流的方式输出

        // 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        SheepPen sheepPen = (SheepPen) ois.readObject();
        bos.close();
        oos.close();
        bis.close();
        ois.close();
        return sheepPen;

    }
}
