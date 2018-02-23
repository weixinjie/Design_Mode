package com.weixinjie.command_pattern;

public class InvokerRole {
    private Command command1;
    //持有多个命令对象[实际的情况也可能是一个命令对象的集合来保存命令对象]

    public void setCommand1(Command command1) {
        this.command1 = command1;
    }


    /**
     * 执行正常命令，1执行回滚命令
     */
    public void invoke(int args) {
        //可以根据具体情况选择执行某些命令
        if (args == 0) {
            command1.execute();
        } else if (args == 1) {
            command1.undo();
        }
    }
}
