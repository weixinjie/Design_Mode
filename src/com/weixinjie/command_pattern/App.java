package com.weixinjie.command_pattern;


/**
 * 命令模式
 */
public class App {
    public static void main(String[] args) {
        //创建一个命令接收者
        ReceiverRole receiverRole1 = new ReceiverRole();                //创建一个命令的具体实现对象，并指定命令接收者
        Command command1 = new ConcreteCommandImpl1(receiverRole1);

        InvokerRole invokerRole = new InvokerRole();//创建一个命令调用者
        invokerRole.setCommand1(command1);//为调用者指定命令对象1
        invokerRole.invoke(0);                //发起调用命令请求
        invokerRole.invoke(1);                //发起调用命令请求
    }
}
