package com.cloud.a命令模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/1
 * @Time 0:02
 */
public class Client {
    public static void main(String[] args) {

        // 创建电灯的实体类
        LightReceiver lightReceiver = new LightReceiver();

        // 创建一个开灯和关灯的命令，用于设置遥控器
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        // 创建一个遥控器
        RemoteController remoteController = new RemoteController();

        // 给遥控器设置相关命令，我们设定no = 0 是电灯
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        // 按下开灯
        remoteController.onButtonWasPushed(0);

        // 撤销
        remoteController.undoButtonWasPushed();

    }
}
