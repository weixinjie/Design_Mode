package com.weixinjie.chain_pattern;


import java.util.Random;

/**
 * 责任链模式
 * 典型的应用场景为Android的事件分发机制
 */
public class App {
    public static void main(String[] args) {
        Leader_GroupLeader groupLeader = new Leader_GroupLeader(1000);
        Leader_Manager manager = new Leader_Manager(10000);
        Leader_Boss boss = new Leader_Boss(50000);

        groupLeader.setmSuperiorLeader(manager);
        manager.setmSuperiorLeader(boss);

        ProgramApes programApes = new AndroidApe(new Random().nextInt(100000));
        groupLeader.handleRequest(programApes);

    }
}
