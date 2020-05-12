package com.jarvis.design.principle.demeter;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/3 17:39
 */
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
