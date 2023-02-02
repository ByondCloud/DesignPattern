package com.cloud.a命令模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/31
 * @Time 23:52
 */
public class RemoteController {

    // 开按钮的命令数组
    Command[] onCommands;
    Command[] offCommands;

    // 撤销
    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    // 给按钮设置需要的命令
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    // 按下开按钮
    public void onButtonWasPushed(int no) {
        // 找到你按下开的按钮，并执行对应的方法
        onCommands[no].execute();
        // 记录本次操作，用于撤销
        undoCommand = onCommands[no];
    }

    // 按下关按钮
    public void offButtonWasPushed(int no) {
        // 找到你按下开的按钮，并执行对应的方法
        offCommands[no].execute();
        // 记录本次操作，用于撤销
        undoCommand = offCommands[no];
    }

    // 按下撤销按钮
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

}
