/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MemoCompiler.Runtime;

import java.util.HashMap;

/**
 *
 * @author orisha
 */
public class DataRobotSingleton {
    private HashMap<String, Integer> tuplaRobot;
    private static DataRobotSingleton dataRobot;

    public static DataRobotSingleton getDataRobot(HashMap<String, Integer> tuplaRobot) {
        if (dataRobot == null) {
            dataRobot = new DataRobotSingleton(tuplaRobot);
        }
        return dataRobot;
    }

    private DataRobotSingleton(HashMap<String, Integer> tuplaRobot) {
        this.tuplaRobot = tuplaRobot;
    }

    /**
     * @return the tuplaRobot
     */
    public HashMap<String, Integer> getTuplaRobot() {
        return tuplaRobot;
    }
}
