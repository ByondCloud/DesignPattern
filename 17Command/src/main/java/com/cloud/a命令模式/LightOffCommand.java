package com.cloud.a命令模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/31
 * @Time 23:47
 */
public class LightOffCommand implements Command {

    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
