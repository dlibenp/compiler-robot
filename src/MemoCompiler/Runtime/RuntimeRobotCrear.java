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
public class RuntimeRobotCrear extends RuntimeOperator{
    String robotname;

    public RuntimeRobotCrear(String robotname) {
        super();
        this.robotname = robotname;
    }

    @Override
    public void execute(Context context) throws Exception {
        Object valueDir = context.getStack().pop();
        Object valuePos2 = context.getStack().pop();
        Object valuePos1 = context.getStack().pop();
        Object valueId = context.getStack().pop();
        
        int valorDir = ((IntValue)valueDir).getValue();
        if (valorDir < 1 || valorDir > 4) {
            throw new Exception("SemanticException: Valor de orientacion excede el rango.");
        }
        
        DataRobotSingleton dataRobot = DataRobotSingleton.getDataRobot(new HashMap<String, Integer>());
        dataRobot.getTuplaRobot().put(robotname, valorDir);
        
        PintarRobot pRobot = new PintarRobot();
        pRobot.PintarRobot(valorDir, robotname, 0);
        
        context.setCurrent(context.getCurrent()+1);
    }
    
}
