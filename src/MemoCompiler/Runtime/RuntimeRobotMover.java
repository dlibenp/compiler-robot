/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MemoCompiler.Runtime;

import MemoCompiler.InOut;
import java.util.HashMap;

/**
 *
 * @author orisha
 */
public class RuntimeRobotMover extends RuntimeOperator{
    String robotname;

    public RuntimeRobotMover(String robotname) {
        super();
        this.robotname = robotname;
    }

    @Override
    public void execute(Context context) throws Exception {
        Object valueData = context.getStack().pop();
        Object valueId = context.getStack().pop();
        
        int valor = ((IntValue)valueData).getValue();
        
        DataRobotSingleton dataRobot = DataRobotSingleton.getDataRobot(new HashMap<String, Integer>());
        int orientacion = dataRobot.getTuplaRobot().get(robotname);
        
        PintarRobot pRobot = new PintarRobot();
        pRobot.PintarRobot(orientacion, robotname, valor);
        
        context.setCurrent(context.getCurrent()+1);
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            //dgfgd
        }*/
    }
}
