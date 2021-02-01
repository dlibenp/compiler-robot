/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MemoCompiler.Runtime;

/**
 *
 * @author orisha
 */
public class RuntimeNewRobot extends RuntimeOperator{

    public RuntimeNewRobot() {
        super();
    }

    @Override
    public void execute(Context context) throws Exception {
        context.getMemory().addVal(new RobotValue());
        context.setCurrent( context.getCurrent() + 1);
    }
}
