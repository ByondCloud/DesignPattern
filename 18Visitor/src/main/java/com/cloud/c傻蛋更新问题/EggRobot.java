package com.cloud.c傻蛋更新问题;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/1
 * @Time 8:24
 */

class Client {
    public static void main(String[] args) {
        EggRobot eggRobot = new EggRobot();
        eggRobot.use();
        UpdateVisitor updateVisitor = new UpdateVisitor();
        eggRobot.accept(updateVisitor);
        eggRobot.use();
    }
}


// 访问者【软件包】
interface Visitor {
    void visitCPU(CPU cpu);
}

class UpdateVisitor implements Visitor {

    @Override
    public void visitCPU(CPU cpu) {
        cpu.command += "后加的指令";
    }
}


// 机器人实体类
class EggRobot {

    private CPU cpu;

    public EggRobot() {
        this.cpu = new CPU("原来的指令");
    }

    public void use() {
        cpu.run();
    }

    public void accept(Visitor visitor) {
        cpu.accept(visitor);
    }

}

// 硬件的抽象类
abstract class Hardware {
    // 指令
    String command;

    public Hardware(String command) {
        this.command = command;
    }

    // CPU具体执行的方法
    public void run() {
        System.out.println(command);
    }

    // 这里我们需要定义一个用来接收更新包的接口
    public abstract void accept(Visitor visitor);

}


class CPU extends Hardware {

    // 复写构造器
    public CPU(String command) {
        super(command);
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitCPU(this);
    }
}
