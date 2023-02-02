package com.cloud.a命令模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/31
 * @Time 23:23
 */
public class LightOnCommand implements Command {

    // 聚合LightReceiver
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
