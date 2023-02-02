package com.cloud.a命令模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/31
 * @Time 23:22
 */
// 创建命令接口
public interface Command {

    // 执行操作
    public void execute();

    // 撤销操作
    public void undo();

}
