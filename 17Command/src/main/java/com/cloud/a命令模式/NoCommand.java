package com.cloud.a命令模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/31
 * @Time 23:48
 */

// 空执行，用于初始化每个按钮
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
