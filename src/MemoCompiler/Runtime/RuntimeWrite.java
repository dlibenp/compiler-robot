/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MemoCompiler.Runtime;

import MemoCompiler.InOut;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author frodo
 */
public class RuntimeWrite extends RuntimeOperator
{
    public RuntimeWrite()
    {
        super();
    }

    @Override
    public void execute(Context context)
    {
        Object value = context.getStack().pop();
        InOut.Write(value.toString(), null);
        context.setCurrent(context.getCurrent()+1);
    }
}
