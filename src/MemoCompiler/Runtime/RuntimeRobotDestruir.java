/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MemoCompiler.Runtime;

import MemoCompiler.InOut;

/**
 *
 * @author orisha
 */
public class RuntimeRobotDestruir extends RuntimeOperator{
    String robotname;

    public RuntimeRobotDestruir(String robotname) {
        super();
        this.robotname = robotname;
    }

    @Override
    public void execute(Context context) throws Exception {
        Object valueId = context.getStack().pop();
        InOut.Write("Destruido robot: "+robotname, null);
        context.setCurrent(context.getCurrent()+1);
    }
}
