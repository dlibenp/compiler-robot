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
public class RuntimeRobotRotar extends RuntimeOperator{
    String robotname;

    public RuntimeRobotRotar(String robotname) {
        super();
        this.robotname = robotname;
    }

    @Override
    public void execute(Context context) throws Exception {
        
        Object valueOrientacion = context.getStack().pop();
        Object valueId = context.getStack().pop();
        
        int valorOrient = ((IntValue)valueOrientacion).getValue();
        
        DataRobotSingleton dataRobot = DataRobotSingleton.getDataRobot(new HashMap<String, Integer>());
        dataRobot.getTuplaRobot().put(robotname, valorOrient);
        
        PintarRobot pRobot = new PintarRobot();
        pRobot.PintarRobot(valorOrient, robotname, 0);
        
        context.setCurrent(context.getCurrent()+1);
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            //dgfgd
        }*/
    }
}
